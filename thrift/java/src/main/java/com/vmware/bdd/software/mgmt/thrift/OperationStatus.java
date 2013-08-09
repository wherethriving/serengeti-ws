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
/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vmware.bdd.software.mgmt.thrift;

import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

/**
 * Operation Status data structure
 */
public class OperationStatus implements org.apache.thrift.TBase<OperationStatus, OperationStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OperationStatus");

  private static final org.apache.thrift.protocol.TField FINISHED_FIELD_DESC = new org.apache.thrift.protocol.TField("finished", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SUCCEED_FIELD_DESC = new org.apache.thrift.protocol.TField("succeed", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField PROGRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("progress", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("error_msg", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField FAILURE_FIELD_DESC = new org.apache.thrift.protocol.TField("failure", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField RUNNING_FIELD_DESC = new org.apache.thrift.protocol.TField("running", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OperationStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OperationStatusTupleSchemeFactory());
  }

  public boolean finished; // optional
  public boolean succeed; // optional
  public int progress; // optional
  public String error_msg; // optional
  public int total; // optional
  public int success; // optional
  public int failure; // optional
  public int running; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FINISHED((short)1, "finished"),
    SUCCEED((short)2, "succeed"),
    PROGRESS((short)3, "progress"),
    ERROR_MSG((short)4, "error_msg"),
    TOTAL((short)5, "total"),
    SUCCESS((short)6, "success"),
    FAILURE((short)7, "failure"),
    RUNNING((short)8, "running");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FINISHED
          return FINISHED;
        case 2: // SUCCEED
          return SUCCEED;
        case 3: // PROGRESS
          return PROGRESS;
        case 4: // ERROR_MSG
          return ERROR_MSG;
        case 5: // TOTAL
          return TOTAL;
        case 6: // SUCCESS
          return SUCCESS;
        case 7: // FAILURE
          return FAILURE;
        case 8: // RUNNING
          return RUNNING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FINISHED_ISSET_ID = 0;
  private static final int __SUCCEED_ISSET_ID = 1;
  private static final int __PROGRESS_ISSET_ID = 2;
  private static final int __TOTAL_ISSET_ID = 3;
  private static final int __SUCCESS_ISSET_ID = 4;
  private static final int __FAILURE_ISSET_ID = 5;
  private static final int __RUNNING_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.FINISHED,_Fields.SUCCEED,_Fields.PROGRESS,_Fields.ERROR_MSG,_Fields.TOTAL,_Fields.SUCCESS,_Fields.FAILURE,_Fields.RUNNING};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FINISHED, new org.apache.thrift.meta_data.FieldMetaData("finished", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SUCCEED, new org.apache.thrift.meta_data.FieldMetaData("succeed", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PROGRESS, new org.apache.thrift.meta_data.FieldMetaData("progress", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_MSG, new org.apache.thrift.meta_data.FieldMetaData("error_msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FAILURE, new org.apache.thrift.meta_data.FieldMetaData("failure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RUNNING, new org.apache.thrift.meta_data.FieldMetaData("running", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OperationStatus.class, metaDataMap);
  }

  public OperationStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OperationStatus(OperationStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.finished = other.finished;
    this.succeed = other.succeed;
    this.progress = other.progress;
    if (other.isSetError_msg()) {
      this.error_msg = other.error_msg;
    }
    this.total = other.total;
    this.success = other.success;
    this.failure = other.failure;
    this.running = other.running;
  }

  public OperationStatus deepCopy() {
    return new OperationStatus(this);
  }

  @Override
  public void clear() {
    setFinishedIsSet(false);
    this.finished = false;
    setSucceedIsSet(false);
    this.succeed = false;
    setProgressIsSet(false);
    this.progress = 0;
    this.error_msg = null;
    setTotalIsSet(false);
    this.total = 0;
    setSuccessIsSet(false);
    this.success = 0;
    setFailureIsSet(false);
    this.failure = 0;
    setRunningIsSet(false);
    this.running = 0;
  }

  public boolean isFinished() {
    return this.finished;
  }

  public OperationStatus setFinished(boolean finished) {
    this.finished = finished;
    setFinishedIsSet(true);
    return this;
  }

  public void unsetFinished() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FINISHED_ISSET_ID);
  }

  /** Returns true if field finished is set (has been assigned a value) and false otherwise */
  public boolean isSetFinished() {
    return EncodingUtils.testBit(__isset_bitfield, __FINISHED_ISSET_ID);
  }

  public void setFinishedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FINISHED_ISSET_ID, value);
  }

  public boolean isSucceed() {
    return this.succeed;
  }

  public OperationStatus setSucceed(boolean succeed) {
    this.succeed = succeed;
    setSucceedIsSet(true);
    return this;
  }

  public void unsetSucceed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCEED_ISSET_ID);
  }

  /** Returns true if field succeed is set (has been assigned a value) and false otherwise */
  public boolean isSetSucceed() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCEED_ISSET_ID);
  }

  public void setSucceedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCEED_ISSET_ID, value);
  }

  public int getProgress() {
    return this.progress;
  }

  public OperationStatus setProgress(int progress) {
    this.progress = progress;
    setProgressIsSet(true);
    return this;
  }

  public void unsetProgress() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROGRESS_ISSET_ID);
  }

  /** Returns true if field progress is set (has been assigned a value) and false otherwise */
  public boolean isSetProgress() {
    return EncodingUtils.testBit(__isset_bitfield, __PROGRESS_ISSET_ID);
  }

  public void setProgressIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROGRESS_ISSET_ID, value);
  }

  public String getError_msg() {
    return this.error_msg;
  }

  public OperationStatus setError_msg(String error_msg) {
    this.error_msg = error_msg;
    return this;
  }

  public void unsetError_msg() {
    this.error_msg = null;
  }

  /** Returns true if field error_msg is set (has been assigned a value) and false otherwise */
  public boolean isSetError_msg() {
    return this.error_msg != null;
  }

  public void setError_msgIsSet(boolean value) {
    if (!value) {
      this.error_msg = null;
    }
  }

  public int getTotal() {
    return this.total;
  }

  public OperationStatus setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public int getSuccess() {
    return this.success;
  }

  public OperationStatus setSuccess(int success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public int getFailure() {
    return this.failure;
  }

  public OperationStatus setFailure(int failure) {
    this.failure = failure;
    setFailureIsSet(true);
    return this;
  }

  public void unsetFailure() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FAILURE_ISSET_ID);
  }

  /** Returns true if field failure is set (has been assigned a value) and false otherwise */
  public boolean isSetFailure() {
    return EncodingUtils.testBit(__isset_bitfield, __FAILURE_ISSET_ID);
  }

  public void setFailureIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FAILURE_ISSET_ID, value);
  }

  public int getRunning() {
    return this.running;
  }

  public OperationStatus setRunning(int running) {
    this.running = running;
    setRunningIsSet(true);
    return this;
  }

  public void unsetRunning() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RUNNING_ISSET_ID);
  }

  /** Returns true if field running is set (has been assigned a value) and false otherwise */
  public boolean isSetRunning() {
    return EncodingUtils.testBit(__isset_bitfield, __RUNNING_ISSET_ID);
  }

  public void setRunningIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RUNNING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FINISHED:
      if (value == null) {
        unsetFinished();
      } else {
        setFinished((Boolean)value);
      }
      break;

    case SUCCEED:
      if (value == null) {
        unsetSucceed();
      } else {
        setSucceed((Boolean)value);
      }
      break;

    case PROGRESS:
      if (value == null) {
        unsetProgress();
      } else {
        setProgress((Integer)value);
      }
      break;

    case ERROR_MSG:
      if (value == null) {
        unsetError_msg();
      } else {
        setError_msg((String)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Integer)value);
      }
      break;

    case FAILURE:
      if (value == null) {
        unsetFailure();
      } else {
        setFailure((Integer)value);
      }
      break;

    case RUNNING:
      if (value == null) {
        unsetRunning();
      } else {
        setRunning((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FINISHED:
      return Boolean.valueOf(isFinished());

    case SUCCEED:
      return Boolean.valueOf(isSucceed());

    case PROGRESS:
      return Integer.valueOf(getProgress());

    case ERROR_MSG:
      return getError_msg();

    case TOTAL:
      return Integer.valueOf(getTotal());

    case SUCCESS:
      return Integer.valueOf(getSuccess());

    case FAILURE:
      return Integer.valueOf(getFailure());

    case RUNNING:
      return Integer.valueOf(getRunning());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FINISHED:
      return isSetFinished();
    case SUCCEED:
      return isSetSucceed();
    case PROGRESS:
      return isSetProgress();
    case ERROR_MSG:
      return isSetError_msg();
    case TOTAL:
      return isSetTotal();
    case SUCCESS:
      return isSetSuccess();
    case FAILURE:
      return isSetFailure();
    case RUNNING:
      return isSetRunning();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OperationStatus)
      return this.equals((OperationStatus)that);
    return false;
  }

  public boolean equals(OperationStatus that) {
    if (that == null)
      return false;

    boolean this_present_finished = true && this.isSetFinished();
    boolean that_present_finished = true && that.isSetFinished();
    if (this_present_finished || that_present_finished) {
      if (!(this_present_finished && that_present_finished))
        return false;
      if (this.finished != that.finished)
        return false;
    }

    boolean this_present_succeed = true && this.isSetSucceed();
    boolean that_present_succeed = true && that.isSetSucceed();
    if (this_present_succeed || that_present_succeed) {
      if (!(this_present_succeed && that_present_succeed))
        return false;
      if (this.succeed != that.succeed)
        return false;
    }

    boolean this_present_progress = true && this.isSetProgress();
    boolean that_present_progress = true && that.isSetProgress();
    if (this_present_progress || that_present_progress) {
      if (!(this_present_progress && that_present_progress))
        return false;
      if (this.progress != that.progress)
        return false;
    }

    boolean this_present_error_msg = true && this.isSetError_msg();
    boolean that_present_error_msg = true && that.isSetError_msg();
    if (this_present_error_msg || that_present_error_msg) {
      if (!(this_present_error_msg && that_present_error_msg))
        return false;
      if (!this.error_msg.equals(that.error_msg))
        return false;
    }

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_success = true && this.isSetSuccess();
    boolean that_present_success = true && that.isSetSuccess();
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_failure = true && this.isSetFailure();
    boolean that_present_failure = true && that.isSetFailure();
    if (this_present_failure || that_present_failure) {
      if (!(this_present_failure && that_present_failure))
        return false;
      if (this.failure != that.failure)
        return false;
    }

    boolean this_present_running = true && this.isSetRunning();
    boolean that_present_running = true && that.isSetRunning();
    if (this_present_running || that_present_running) {
      if (!(this_present_running && that_present_running))
        return false;
      if (this.running != that.running)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(OperationStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    OperationStatus typedOther = (OperationStatus)other;

    lastComparison = Boolean.valueOf(isSetFinished()).compareTo(typedOther.isSetFinished());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinished()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finished, typedOther.finished);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSucceed()).compareTo(typedOther.isSetSucceed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSucceed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.succeed, typedOther.succeed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProgress()).compareTo(typedOther.isSetProgress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProgress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.progress, typedOther.progress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError_msg()).compareTo(typedOther.isSetError_msg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_msg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_msg, typedOther.error_msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(typedOther.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, typedOther.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailure()).compareTo(typedOther.isSetFailure());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailure()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failure, typedOther.failure);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunning()).compareTo(typedOther.isSetRunning());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunning()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.running, typedOther.running);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OperationStatus(");
    boolean first = true;

    if (isSetFinished()) {
      sb.append("finished:");
      sb.append(this.finished);
      first = false;
    }
    if (isSetSucceed()) {
      if (!first) sb.append(", ");
      sb.append("succeed:");
      sb.append(this.succeed);
      first = false;
    }
    if (isSetProgress()) {
      if (!first) sb.append(", ");
      sb.append("progress:");
      sb.append(this.progress);
      first = false;
    }
    if (isSetError_msg()) {
      if (!first) sb.append(", ");
      sb.append("error_msg:");
      if (this.error_msg == null) {
        sb.append("null");
      } else {
        sb.append(this.error_msg);
      }
      first = false;
    }
    if (isSetTotal()) {
      if (!first) sb.append(", ");
      sb.append("total:");
      sb.append(this.total);
      first = false;
    }
    if (isSetSuccess()) {
      if (!first) sb.append(", ");
      sb.append("success:");
      sb.append(this.success);
      first = false;
    }
    if (isSetFailure()) {
      if (!first) sb.append(", ");
      sb.append("failure:");
      sb.append(this.failure);
      first = false;
    }
    if (isSetRunning()) {
      if (!first) sb.append(", ");
      sb.append("running:");
      sb.append(this.running);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OperationStatusStandardSchemeFactory implements SchemeFactory {
    public OperationStatusStandardScheme getScheme() {
      return new OperationStatusStandardScheme();
    }
  }

  private static class OperationStatusStandardScheme extends StandardScheme<OperationStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OperationStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FINISHED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.finished = iprot.readBool();
              struct.setFinishedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUCCEED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.succeed = iprot.readBool();
              struct.setSucceedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROGRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.progress = iprot.readI32();
              struct.setProgressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_msg = iprot.readString();
              struct.setError_msgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.success = iprot.readI32();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FAILURE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.failure = iprot.readI32();
              struct.setFailureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // RUNNING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.running = iprot.readI32();
              struct.setRunningIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OperationStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetFinished()) {
        oprot.writeFieldBegin(FINISHED_FIELD_DESC);
        oprot.writeBool(struct.finished);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSucceed()) {
        oprot.writeFieldBegin(SUCCEED_FIELD_DESC);
        oprot.writeBool(struct.succeed);
        oprot.writeFieldEnd();
      }
      if (struct.isSetProgress()) {
        oprot.writeFieldBegin(PROGRESS_FIELD_DESC);
        oprot.writeI32(struct.progress);
        oprot.writeFieldEnd();
      }
      if (struct.error_msg != null) {
        if (struct.isSetError_msg()) {
          oprot.writeFieldBegin(ERROR_MSG_FIELD_DESC);
          oprot.writeString(struct.error_msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTotal()) {
        oprot.writeFieldBegin(TOTAL_FIELD_DESC);
        oprot.writeI32(struct.total);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        oprot.writeI32(struct.success);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFailure()) {
        oprot.writeFieldBegin(FAILURE_FIELD_DESC);
        oprot.writeI32(struct.failure);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRunning()) {
        oprot.writeFieldBegin(RUNNING_FIELD_DESC);
        oprot.writeI32(struct.running);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OperationStatusTupleSchemeFactory implements SchemeFactory {
    public OperationStatusTupleScheme getScheme() {
      return new OperationStatusTupleScheme();
    }
  }

  private static class OperationStatusTupleScheme extends TupleScheme<OperationStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OperationStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFinished()) {
        optionals.set(0);
      }
      if (struct.isSetSucceed()) {
        optionals.set(1);
      }
      if (struct.isSetProgress()) {
        optionals.set(2);
      }
      if (struct.isSetError_msg()) {
        optionals.set(3);
      }
      if (struct.isSetTotal()) {
        optionals.set(4);
      }
      if (struct.isSetSuccess()) {
        optionals.set(5);
      }
      if (struct.isSetFailure()) {
        optionals.set(6);
      }
      if (struct.isSetRunning()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetFinished()) {
        oprot.writeBool(struct.finished);
      }
      if (struct.isSetSucceed()) {
        oprot.writeBool(struct.succeed);
      }
      if (struct.isSetProgress()) {
        oprot.writeI32(struct.progress);
      }
      if (struct.isSetError_msg()) {
        oprot.writeString(struct.error_msg);
      }
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
      if (struct.isSetSuccess()) {
        oprot.writeI32(struct.success);
      }
      if (struct.isSetFailure()) {
        oprot.writeI32(struct.failure);
      }
      if (struct.isSetRunning()) {
        oprot.writeI32(struct.running);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OperationStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.finished = iprot.readBool();
        struct.setFinishedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.succeed = iprot.readBool();
        struct.setSucceedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.progress = iprot.readI32();
        struct.setProgressIsSet(true);
      }
      if (incoming.get(3)) {
        struct.error_msg = iprot.readString();
        struct.setError_msgIsSet(true);
      }
      if (incoming.get(4)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
      if (incoming.get(5)) {
        struct.success = iprot.readI32();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(6)) {
        struct.failure = iprot.readI32();
        struct.setFailureIsSet(true);
      }
      if (incoming.get(7)) {
        struct.running = iprot.readI32();
        struct.setRunningIsSet(true);
      }
    }
  }

}

