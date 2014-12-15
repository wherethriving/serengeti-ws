/******************************************************************************
 *   Copyright (c) 2014 VMware, Inc. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *****************************************************************************/
package com.vmware.bdd.usermgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vmware.bdd.apitypes.UserMgmtServer;
import com.vmware.bdd.usermgmt.persist.UserMgmtServerEao;

/**
 * Created By xiaoliangl on 11/28/14.
 */
@Component
public class UserMgmtServerService {
   @Autowired
   private UserMgmtServerEao serverEao;

   @Autowired
   private UserMgmtServerValidService serverValidService;

   public void setServerEao(UserMgmtServerEao serverEao) {
      this.serverEao = serverEao;
   }

   public void setServerValidService(UserMgmtServerValidService serverValidService) {
      this.serverValidService = serverValidService;
   }

   public void add(UserMgmtServer userMgtServer, boolean testOnly, boolean forceTrustCert) {
      serverValidService.validateServerInfo(userMgtServer, forceTrustCert);

      if (!testOnly) {
         serverEao.persist(userMgtServer);
      }
   }

   public UserMgmtServer getByName(String name, boolean secure) {
      UserMgmtServer userMgmtServer = serverEao.findByName(name);

      if(secure) {
         //@TODO handle password masking
      }

      return userMgmtServer;
   }

   public void deleteByName(String name) {
      serverEao.delete(name);
   }
}
