/***************************************************************************
 * Copyright (c) 2012-2013 VMware, Inc. All Rights Reserved.
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
package com.vmware.bdd.command;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestClusterCmdUtil {

   @Test
   public void testGetLogLevel() {
      Logger.getRootLogger().setLevel(Level.WARN);
      assertEquals(ClusterCmdUtil.getLogLevel(), "-V");
   }

   @Test
   public void testGetIndexFromNodeName() {
      String node = "test-worker-0";
      assertEquals(ClusterCmdUtil.getIndexFromNodeName(node), 0);
   }

}
