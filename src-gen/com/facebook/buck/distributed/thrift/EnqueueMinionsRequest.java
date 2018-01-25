/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-01-23")
public class EnqueueMinionsRequest implements org.apache.thrift.TBase<EnqueueMinionsRequest, EnqueueMinionsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<EnqueueMinionsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EnqueueMinionsRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MINION_QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("minionQueue", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_MINIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("numberOfMinions", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EnqueueMinionsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EnqueueMinionsRequestTupleSchemeFactory());
  }

  public StampedeId stampedeId; // optional
  public String minionQueue; // optional
  public int numberOfMinions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    MINION_QUEUE((short)2, "minionQueue"),
    NUMBER_OF_MINIONS((short)3, "numberOfMinions");

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
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // MINION_QUEUE
          return MINION_QUEUE;
        case 3: // NUMBER_OF_MINIONS
          return NUMBER_OF_MINIONS;
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
  private static final int __NUMBEROFMINIONS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.MINION_QUEUE,_Fields.NUMBER_OF_MINIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.MINION_QUEUE, new org.apache.thrift.meta_data.FieldMetaData("minionQueue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER_OF_MINIONS, new org.apache.thrift.meta_data.FieldMetaData("numberOfMinions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EnqueueMinionsRequest.class, metaDataMap);
  }

  public EnqueueMinionsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EnqueueMinionsRequest(EnqueueMinionsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetMinionQueue()) {
      this.minionQueue = other.minionQueue;
    }
    this.numberOfMinions = other.numberOfMinions;
  }

  public EnqueueMinionsRequest deepCopy() {
    return new EnqueueMinionsRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.minionQueue = null;
    setNumberOfMinionsIsSet(false);
    this.numberOfMinions = 0;
  }

  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public EnqueueMinionsRequest setStampedeId(StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public String getMinionQueue() {
    return this.minionQueue;
  }

  public EnqueueMinionsRequest setMinionQueue(String minionQueue) {
    this.minionQueue = minionQueue;
    return this;
  }

  public void unsetMinionQueue() {
    this.minionQueue = null;
  }

  /** Returns true if field minionQueue is set (has been assigned a value) and false otherwise */
  public boolean isSetMinionQueue() {
    return this.minionQueue != null;
  }

  public void setMinionQueueIsSet(boolean value) {
    if (!value) {
      this.minionQueue = null;
    }
  }

  public int getNumberOfMinions() {
    return this.numberOfMinions;
  }

  public EnqueueMinionsRequest setNumberOfMinions(int numberOfMinions) {
    this.numberOfMinions = numberOfMinions;
    setNumberOfMinionsIsSet(true);
    return this;
  }

  public void unsetNumberOfMinions() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  /** Returns true if field numberOfMinions is set (has been assigned a value) and false otherwise */
  public boolean isSetNumberOfMinions() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  public void setNumberOfMinionsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case MINION_QUEUE:
      if (value == null) {
        unsetMinionQueue();
      } else {
        setMinionQueue((String)value);
      }
      break;

    case NUMBER_OF_MINIONS:
      if (value == null) {
        unsetNumberOfMinions();
      } else {
        setNumberOfMinions((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case MINION_QUEUE:
      return getMinionQueue();

    case NUMBER_OF_MINIONS:
      return getNumberOfMinions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case MINION_QUEUE:
      return isSetMinionQueue();
    case NUMBER_OF_MINIONS:
      return isSetNumberOfMinions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EnqueueMinionsRequest)
      return this.equals((EnqueueMinionsRequest)that);
    return false;
  }

  public boolean equals(EnqueueMinionsRequest that) {
    if (that == null)
      return false;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_minionQueue = true && this.isSetMinionQueue();
    boolean that_present_minionQueue = true && that.isSetMinionQueue();
    if (this_present_minionQueue || that_present_minionQueue) {
      if (!(this_present_minionQueue && that_present_minionQueue))
        return false;
      if (!this.minionQueue.equals(that.minionQueue))
        return false;
    }

    boolean this_present_numberOfMinions = true && this.isSetNumberOfMinions();
    boolean that_present_numberOfMinions = true && that.isSetNumberOfMinions();
    if (this_present_numberOfMinions || that_present_numberOfMinions) {
      if (!(this_present_numberOfMinions && that_present_numberOfMinions))
        return false;
      if (this.numberOfMinions != that.numberOfMinions)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_minionQueue = true && (isSetMinionQueue());
    list.add(present_minionQueue);
    if (present_minionQueue)
      list.add(minionQueue);

    boolean present_numberOfMinions = true && (isSetNumberOfMinions());
    list.add(present_numberOfMinions);
    if (present_numberOfMinions)
      list.add(numberOfMinions);

    return list.hashCode();
  }

  @Override
  public int compareTo(EnqueueMinionsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinionQueue()).compareTo(other.isSetMinionQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinionQueue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minionQueue, other.minionQueue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumberOfMinions()).compareTo(other.isSetNumberOfMinions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumberOfMinions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numberOfMinions, other.numberOfMinions);
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
    StringBuilder sb = new StringBuilder("EnqueueMinionsRequest(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetMinionQueue()) {
      if (!first) sb.append(", ");
      sb.append("minionQueue:");
      if (this.minionQueue == null) {
        sb.append("null");
      } else {
        sb.append(this.minionQueue);
      }
      first = false;
    }
    if (isSetNumberOfMinions()) {
      if (!first) sb.append(", ");
      sb.append("numberOfMinions:");
      sb.append(this.numberOfMinions);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
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

  private static class EnqueueMinionsRequestStandardSchemeFactory implements SchemeFactory {
    public EnqueueMinionsRequestStandardScheme getScheme() {
      return new EnqueueMinionsRequestStandardScheme();
    }
  }

  private static class EnqueueMinionsRequestStandardScheme extends StandardScheme<EnqueueMinionsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MINION_QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.minionQueue = iprot.readString();
              struct.setMinionQueueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUMBER_OF_MINIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numberOfMinions = iprot.readI32();
              struct.setNumberOfMinionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.minionQueue != null) {
        if (struct.isSetMinionQueue()) {
          oprot.writeFieldBegin(MINION_QUEUE_FIELD_DESC);
          oprot.writeString(struct.minionQueue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeFieldBegin(NUMBER_OF_MINIONS_FIELD_DESC);
        oprot.writeI32(struct.numberOfMinions);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EnqueueMinionsRequestTupleSchemeFactory implements SchemeFactory {
    public EnqueueMinionsRequestTupleScheme getScheme() {
      return new EnqueueMinionsRequestTupleScheme();
    }
  }

  private static class EnqueueMinionsRequestTupleScheme extends TupleScheme<EnqueueMinionsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetMinionQueue()) {
        optionals.set(1);
      }
      if (struct.isSetNumberOfMinions()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetMinionQueue()) {
        oprot.writeString(struct.minionQueue);
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeI32(struct.numberOfMinions);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.minionQueue = iprot.readString();
        struct.setMinionQueueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.numberOfMinions = iprot.readI32();
        struct.setNumberOfMinionsIsSet(true);
      }
    }
  }

}

