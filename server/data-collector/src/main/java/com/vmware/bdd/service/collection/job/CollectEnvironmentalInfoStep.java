/***************************************************************************
 * Copyright (c) 2012-2014 VMware, Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package com.vmware.bdd.service.collection.job;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;

import com.vmware.bdd.apitypes.DataObjectType;
import com.vmware.bdd.manager.collection.CollectionDriverManager;
import com.vmware.bdd.service.collection.IPeriodCollectionService;
import com.vmware.bdd.service.job.JobExecutionStatusHolder;
import com.vmware.bdd.service.job.TrackableTasklet;

public class CollectEnvironmentalInfoStep extends TrackableTasklet {

   private static final Logger logger = Logger
         .getLogger(CollectEnvironmentalInfoStep.class);

   CollectionDriverManager collectionDriverManager;
   IPeriodCollectionService periodCollectionService;

   @Override
   public RepeatStatus executeStep(ChunkContext chunkContext,
         JobExecutionStatusHolder jobExecutionStatusHolder) throws Exception {
      sendEnvironmentalData(periodCollectionService.collectData(DataObjectType.ENVIRONMENTAL_INFORMATION));
      return RepeatStatus.FINISHED;
   }

   private void sendEnvironmentalData (Map<String, Map<String, ?>> data) {
      collectionDriverManager.getDriver().send(data);
   }

   public IPeriodCollectionService getPeriodCollectionService() {
      return periodCollectionService;
   }

   public void setPeriodCollectionService(
         IPeriodCollectionService periodCollectionService) {
      this.periodCollectionService = periodCollectionService;
   }

   public CollectionDriverManager getCollectionDriverManager() {
      return collectionDriverManager;
   }

   public void setCollectionDriverManager(
         CollectionDriverManager collectionDriverManager) {
      this.collectionDriverManager = collectionDriverManager;
   }

}
