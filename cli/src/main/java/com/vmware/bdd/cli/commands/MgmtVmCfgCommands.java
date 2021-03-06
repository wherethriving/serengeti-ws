/******************************************************************************
 *   Copyright (c) 2014-2015 VMware, Inc. All Rights Reserved.
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
package com.vmware.bdd.cli.commands;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

import com.vmware.bdd.cli.rest.CliRestException;
import com.vmware.bdd.cli.rest.MgmtVMCfgClient;
import com.vmware.bdd.usermgmt.UserMgmtConstants;
import com.vmware.bdd.usermgmt.UserMgmtMode;

/**
 * Created By xiaoliangl on 12/26/14.
 */
@Component
public class MgmtVmCfgCommands implements CommandMarker {

   @Autowired
   private MgmtVMCfgClient mgmtCfgOnMgmtVMClient;

   @CliAvailabilityIndicator({"mgmtvmcfg help"})
   public boolean isCommandAvailable() {
      return true;
   }

   @CliCommand(value = "mgmtvmcfg modify", help = "configure management VM.")
   public void modifyMgmtVMCfg(
         @CliOption(key = {"usermgmtmode"}, mandatory = true, help = "User management mode {MIXED, LDAP}.") final String mode
   ) {

      try {
         UserMgmtMode.valueOf(mode);
         mgmtCfgOnMgmtVMClient.config(mode);
         CommandOutputHelper.MODIFY_MGMTVMCFG_OUTPUT.printSuccess();
      } catch (IllegalArgumentException e) {
         CommandOutputHelper.MODIFY_MGMTVMCFG_OUTPUT.printFailure("Invalid User management mode.");
      } catch (CliRestException e) {
         CommandOutputHelper.MODIFY_MGMTVMCFG_OUTPUT.printFailure(e);
      }
   }

   @CliCommand(value = "mgmtvmcfg get", help = "get management VM's Configuration.")
   public void getMgmtVMCfg() {
      try {
         final Map<String, String> mgmtVMcfg = mgmtCfgOnMgmtVMClient.get();

         MgmtVmCfg mgmtVmCfgBean = new MgmtVmCfg();
         mgmtVmCfgBean.mgmtVMcfg = mgmtVMcfg;

         LinkedHashMap<String, List<String>> distroColumnNamesWithGetMethodNames = new LinkedHashMap<String, List<String>>();
         distroColumnNamesWithGetMethodNames.put(
               "USER MANAGEMENT MODE", Arrays.asList("getUserMgmtMode"));

         try {
            CommandsUtils.printInTableFormat(
                  distroColumnNamesWithGetMethodNames, new Object[]{mgmtVmCfgBean},
                  Constants.OUTPUT_INDENT);
         } catch (Exception e) {
            CommandOutputHelper.GET_MGMTVMCFG_OUTPUT.printFailure(e);
         }
      } catch (CliRestException e) {
         CommandOutputHelper.GET_MGMTVMCFG_OUTPUT.printFailure(e);
      }
   }

   class MgmtVmCfg {
      private  Map<String, String> mgmtVMcfg;
      public String getUserMgmtMode() {
         return mgmtVMcfg.get(UserMgmtConstants.VMCONFIG_MGMTVM_CUM_MODE);
      }
   }

}
