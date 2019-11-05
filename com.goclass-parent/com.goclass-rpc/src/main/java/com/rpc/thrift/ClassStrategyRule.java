/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-14")
public class ClassStrategyRule implements org.apache.thrift.TBase<ClassStrategyRule, ClassStrategyRule._Fields>, java.io.Serializable, Cloneable, Comparable<ClassStrategyRule> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClassStrategyRule");

  private static final org.apache.thrift.protocol.TField SUBJECT_TEACHER_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("subjectTeacherNumber", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField SECTION_STUDENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("sectionStudentNumber", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_AND_MIN_CLASS_STUDENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("maxAndMinClassStudentNumber", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField RUNING_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("runing_time", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClassStrategyRuleStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClassStrategyRuleTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> maxAndMinClassStudentNumber; // required
  public int runing_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUBJECT_TEACHER_NUMBER((short)2, "subjectTeacherNumber"),
    SECTION_STUDENT_NUMBER((short)3, "sectionStudentNumber"),
    MAX_AND_MIN_CLASS_STUDENT_NUMBER((short)4, "maxAndMinClassStudentNumber"),
    RUNING_TIME((short)5, "runing_time");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // SUBJECT_TEACHER_NUMBER
          return SUBJECT_TEACHER_NUMBER;
        case 3: // SECTION_STUDENT_NUMBER
          return SECTION_STUDENT_NUMBER;
        case 4: // MAX_AND_MIN_CLASS_STUDENT_NUMBER
          return MAX_AND_MIN_CLASS_STUDENT_NUMBER;
        case 5: // RUNING_TIME
          return RUNING_TIME;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RUNING_TIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUBJECT_TEACHER_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("subjectTeacherNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.SECTION_STUDENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("sectionStudentNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.MAX_AND_MIN_CLASS_STUDENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("maxAndMinClassStudentNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.RUNING_TIME, new org.apache.thrift.meta_data.FieldMetaData("runing_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClassStrategyRule.class, metaDataMap);
  }

  public ClassStrategyRule() {
    this.runing_time = 50;

  }

  public ClassStrategyRule(
    java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber,
    java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber,
    java.util.List<java.lang.Integer> maxAndMinClassStudentNumber,
    int runing_time)
  {
    this();
    this.subjectTeacherNumber = subjectTeacherNumber;
    this.sectionStudentNumber = sectionStudentNumber;
    this.maxAndMinClassStudentNumber = maxAndMinClassStudentNumber;
    this.runing_time = runing_time;
    setRuning_timeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClassStrategyRule(ClassStrategyRule other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSubjectTeacherNumber()) {
      java.util.Map<java.lang.Short,java.lang.Integer> __this__subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(other.subjectTeacherNumber);
      this.subjectTeacherNumber = __this__subjectTeacherNumber;
    }
    if (other.isSetSectionStudentNumber()) {
      java.util.Map<java.lang.Short,java.lang.Integer> __this__sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(other.sectionStudentNumber);
      this.sectionStudentNumber = __this__sectionStudentNumber;
    }
    if (other.isSetMaxAndMinClassStudentNumber()) {
      java.util.List<java.lang.Integer> __this__maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(other.maxAndMinClassStudentNumber);
      this.maxAndMinClassStudentNumber = __this__maxAndMinClassStudentNumber;
    }
    this.runing_time = other.runing_time;
  }

  public ClassStrategyRule deepCopy() {
    return new ClassStrategyRule(this);
  }

  @Override
  public void clear() {
    this.subjectTeacherNumber = null;
    this.sectionStudentNumber = null;
    this.maxAndMinClassStudentNumber = null;
    this.runing_time = 50;

  }

  public int getSubjectTeacherNumberSize() {
    return (this.subjectTeacherNumber == null) ? 0 : this.subjectTeacherNumber.size();
  }

  public void putToSubjectTeacherNumber(short key, int val) {
    if (this.subjectTeacherNumber == null) {
      this.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>();
    }
    this.subjectTeacherNumber.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Short,java.lang.Integer> getSubjectTeacherNumber() {
    return this.subjectTeacherNumber;
  }

  public ClassStrategyRule setSubjectTeacherNumber(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber) {
    this.subjectTeacherNumber = subjectTeacherNumber;
    return this;
  }

  public void unsetSubjectTeacherNumber() {
    this.subjectTeacherNumber = null;
  }

  /** Returns true if field subjectTeacherNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSubjectTeacherNumber() {
    return this.subjectTeacherNumber != null;
  }

  public void setSubjectTeacherNumberIsSet(boolean value) {
    if (!value) {
      this.subjectTeacherNumber = null;
    }
  }

  public int getSectionStudentNumberSize() {
    return (this.sectionStudentNumber == null) ? 0 : this.sectionStudentNumber.size();
  }

  public void putToSectionStudentNumber(short key, int val) {
    if (this.sectionStudentNumber == null) {
      this.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>();
    }
    this.sectionStudentNumber.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Short,java.lang.Integer> getSectionStudentNumber() {
    return this.sectionStudentNumber;
  }

  public ClassStrategyRule setSectionStudentNumber(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber) {
    this.sectionStudentNumber = sectionStudentNumber;
    return this;
  }

  public void unsetSectionStudentNumber() {
    this.sectionStudentNumber = null;
  }

  /** Returns true if field sectionStudentNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSectionStudentNumber() {
    return this.sectionStudentNumber != null;
  }

  public void setSectionStudentNumberIsSet(boolean value) {
    if (!value) {
      this.sectionStudentNumber = null;
    }
  }

  public int getMaxAndMinClassStudentNumberSize() {
    return (this.maxAndMinClassStudentNumber == null) ? 0 : this.maxAndMinClassStudentNumber.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getMaxAndMinClassStudentNumberIterator() {
    return (this.maxAndMinClassStudentNumber == null) ? null : this.maxAndMinClassStudentNumber.iterator();
  }

  public void addToMaxAndMinClassStudentNumber(int elem) {
    if (this.maxAndMinClassStudentNumber == null) {
      this.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>();
    }
    this.maxAndMinClassStudentNumber.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getMaxAndMinClassStudentNumber() {
    return this.maxAndMinClassStudentNumber;
  }

  public ClassStrategyRule setMaxAndMinClassStudentNumber(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> maxAndMinClassStudentNumber) {
    this.maxAndMinClassStudentNumber = maxAndMinClassStudentNumber;
    return this;
  }

  public void unsetMaxAndMinClassStudentNumber() {
    this.maxAndMinClassStudentNumber = null;
  }

  /** Returns true if field maxAndMinClassStudentNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxAndMinClassStudentNumber() {
    return this.maxAndMinClassStudentNumber != null;
  }

  public void setMaxAndMinClassStudentNumberIsSet(boolean value) {
    if (!value) {
      this.maxAndMinClassStudentNumber = null;
    }
  }

  public int getRuning_time() {
    return this.runing_time;
  }

  public ClassStrategyRule setRuning_time(int runing_time) {
    this.runing_time = runing_time;
    setRuning_timeIsSet(true);
    return this;
  }

  public void unsetRuning_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RUNING_TIME_ISSET_ID);
  }

  /** Returns true if field runing_time is set (has been assigned a value) and false otherwise */
  public boolean isSetRuning_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RUNING_TIME_ISSET_ID);
  }

  public void setRuning_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RUNING_TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      if (value == null) {
        unsetSubjectTeacherNumber();
      } else {
        setSubjectTeacherNumber((java.util.Map<java.lang.Short,java.lang.Integer>)value);
      }
      break;

    case SECTION_STUDENT_NUMBER:
      if (value == null) {
        unsetSectionStudentNumber();
      } else {
        setSectionStudentNumber((java.util.Map<java.lang.Short,java.lang.Integer>)value);
      }
      break;

    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      if (value == null) {
        unsetMaxAndMinClassStudentNumber();
      } else {
        setMaxAndMinClassStudentNumber((java.util.List<java.lang.Integer>)value);
      }
      break;

    case RUNING_TIME:
      if (value == null) {
        unsetRuning_time();
      } else {
        setRuning_time((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      return getSubjectTeacherNumber();

    case SECTION_STUDENT_NUMBER:
      return getSectionStudentNumber();

    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      return getMaxAndMinClassStudentNumber();

    case RUNING_TIME:
      return getRuning_time();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      return isSetSubjectTeacherNumber();
    case SECTION_STUDENT_NUMBER:
      return isSetSectionStudentNumber();
    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      return isSetMaxAndMinClassStudentNumber();
    case RUNING_TIME:
      return isSetRuning_time();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClassStrategyRule)
      return this.equals((ClassStrategyRule)that);
    return false;
  }

  public boolean equals(ClassStrategyRule that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_subjectTeacherNumber = true && this.isSetSubjectTeacherNumber();
    boolean that_present_subjectTeacherNumber = true && that.isSetSubjectTeacherNumber();
    if (this_present_subjectTeacherNumber || that_present_subjectTeacherNumber) {
      if (!(this_present_subjectTeacherNumber && that_present_subjectTeacherNumber))
        return false;
      if (!this.subjectTeacherNumber.equals(that.subjectTeacherNumber))
        return false;
    }

    boolean this_present_sectionStudentNumber = true && this.isSetSectionStudentNumber();
    boolean that_present_sectionStudentNumber = true && that.isSetSectionStudentNumber();
    if (this_present_sectionStudentNumber || that_present_sectionStudentNumber) {
      if (!(this_present_sectionStudentNumber && that_present_sectionStudentNumber))
        return false;
      if (!this.sectionStudentNumber.equals(that.sectionStudentNumber))
        return false;
    }

    boolean this_present_maxAndMinClassStudentNumber = true && this.isSetMaxAndMinClassStudentNumber();
    boolean that_present_maxAndMinClassStudentNumber = true && that.isSetMaxAndMinClassStudentNumber();
    if (this_present_maxAndMinClassStudentNumber || that_present_maxAndMinClassStudentNumber) {
      if (!(this_present_maxAndMinClassStudentNumber && that_present_maxAndMinClassStudentNumber))
        return false;
      if (!this.maxAndMinClassStudentNumber.equals(that.maxAndMinClassStudentNumber))
        return false;
    }

    boolean this_present_runing_time = true;
    boolean that_present_runing_time = true;
    if (this_present_runing_time || that_present_runing_time) {
      if (!(this_present_runing_time && that_present_runing_time))
        return false;
      if (this.runing_time != that.runing_time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSubjectTeacherNumber()) ? 131071 : 524287);
    if (isSetSubjectTeacherNumber())
      hashCode = hashCode * 8191 + subjectTeacherNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetSectionStudentNumber()) ? 131071 : 524287);
    if (isSetSectionStudentNumber())
      hashCode = hashCode * 8191 + sectionStudentNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetMaxAndMinClassStudentNumber()) ? 131071 : 524287);
    if (isSetMaxAndMinClassStudentNumber())
      hashCode = hashCode * 8191 + maxAndMinClassStudentNumber.hashCode();

    hashCode = hashCode * 8191 + runing_time;

    return hashCode;
  }

  @Override
  public int compareTo(ClassStrategyRule other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSubjectTeacherNumber()).compareTo(other.isSetSubjectTeacherNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubjectTeacherNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subjectTeacherNumber, other.subjectTeacherNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSectionStudentNumber()).compareTo(other.isSetSectionStudentNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSectionStudentNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sectionStudentNumber, other.sectionStudentNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMaxAndMinClassStudentNumber()).compareTo(other.isSetMaxAndMinClassStudentNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxAndMinClassStudentNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxAndMinClassStudentNumber, other.maxAndMinClassStudentNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRuning_time()).compareTo(other.isSetRuning_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuning_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runing_time, other.runing_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassStrategyRule(");
    boolean first = true;

    sb.append("subjectTeacherNumber:");
    if (this.subjectTeacherNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.subjectTeacherNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sectionStudentNumber:");
    if (this.sectionStudentNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.sectionStudentNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxAndMinClassStudentNumber:");
    if (this.maxAndMinClassStudentNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.maxAndMinClassStudentNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("runing_time:");
    sb.append(this.runing_time);
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClassStrategyRuleStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyRuleStandardScheme getScheme() {
      return new ClassStrategyRuleStandardScheme();
    }
  }

  private static class ClassStrategyRuleStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClassStrategyRule> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SUBJECT_TEACHER_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map192 = iprot.readMapBegin();
                struct.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map192.size);
                short _key193;
                int _val194;
                for (int _i195 = 0; _i195 < _map192.size; ++_i195)
                {
                  _key193 = iprot.readI16();
                  _val194 = iprot.readI32();
                  struct.subjectTeacherNumber.put(_key193, _val194);
                }
                iprot.readMapEnd();
              }
              struct.setSubjectTeacherNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SECTION_STUDENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map196 = iprot.readMapBegin();
                struct.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map196.size);
                short _key197;
                int _val198;
                for (int _i199 = 0; _i199 < _map196.size; ++_i199)
                {
                  _key197 = iprot.readI16();
                  _val198 = iprot.readI32();
                  struct.sectionStudentNumber.put(_key197, _val198);
                }
                iprot.readMapEnd();
              }
              struct.setSectionStudentNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_AND_MIN_CLASS_STUDENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list200 = iprot.readListBegin();
                struct.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(_list200.size);
                int _elem201;
                for (int _i202 = 0; _i202 < _list200.size; ++_i202)
                {
                  _elem201 = iprot.readI32();
                  struct.maxAndMinClassStudentNumber.add(_elem201);
                }
                iprot.readListEnd();
              }
              struct.setMaxAndMinClassStudentNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RUNING_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.runing_time = iprot.readI32();
              struct.setRuning_timeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subjectTeacherNumber != null) {
        oprot.writeFieldBegin(SUBJECT_TEACHER_NUMBER_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, struct.subjectTeacherNumber.size()));
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter203 : struct.subjectTeacherNumber.entrySet())
          {
            oprot.writeI16(_iter203.getKey());
            oprot.writeI32(_iter203.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sectionStudentNumber != null) {
        oprot.writeFieldBegin(SECTION_STUDENT_NUMBER_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, struct.sectionStudentNumber.size()));
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter204 : struct.sectionStudentNumber.entrySet())
          {
            oprot.writeI16(_iter204.getKey());
            oprot.writeI32(_iter204.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.maxAndMinClassStudentNumber != null) {
        oprot.writeFieldBegin(MAX_AND_MIN_CLASS_STUDENT_NUMBER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.maxAndMinClassStudentNumber.size()));
          for (int _iter205 : struct.maxAndMinClassStudentNumber)
          {
            oprot.writeI32(_iter205);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RUNING_TIME_FIELD_DESC);
      oprot.writeI32(struct.runing_time);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClassStrategyRuleTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyRuleTupleScheme getScheme() {
      return new ClassStrategyRuleTupleScheme();
    }
  }

  private static class ClassStrategyRuleTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClassStrategyRule> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSubjectTeacherNumber()) {
        optionals.set(0);
      }
      if (struct.isSetSectionStudentNumber()) {
        optionals.set(1);
      }
      if (struct.isSetMaxAndMinClassStudentNumber()) {
        optionals.set(2);
      }
      if (struct.isSetRuning_time()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSubjectTeacherNumber()) {
        {
          oprot.writeI32(struct.subjectTeacherNumber.size());
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter206 : struct.subjectTeacherNumber.entrySet())
          {
            oprot.writeI16(_iter206.getKey());
            oprot.writeI32(_iter206.getValue());
          }
        }
      }
      if (struct.isSetSectionStudentNumber()) {
        {
          oprot.writeI32(struct.sectionStudentNumber.size());
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter207 : struct.sectionStudentNumber.entrySet())
          {
            oprot.writeI16(_iter207.getKey());
            oprot.writeI32(_iter207.getValue());
          }
        }
      }
      if (struct.isSetMaxAndMinClassStudentNumber()) {
        {
          oprot.writeI32(struct.maxAndMinClassStudentNumber.size());
          for (int _iter208 : struct.maxAndMinClassStudentNumber)
          {
            oprot.writeI32(_iter208);
          }
        }
      }
      if (struct.isSetRuning_time()) {
        oprot.writeI32(struct.runing_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map209 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map209.size);
          short _key210;
          int _val211;
          for (int _i212 = 0; _i212 < _map209.size; ++_i212)
          {
            _key210 = iprot.readI16();
            _val211 = iprot.readI32();
            struct.subjectTeacherNumber.put(_key210, _val211);
          }
        }
        struct.setSubjectTeacherNumberIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map213 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map213.size);
          short _key214;
          int _val215;
          for (int _i216 = 0; _i216 < _map213.size; ++_i216)
          {
            _key214 = iprot.readI16();
            _val215 = iprot.readI32();
            struct.sectionStudentNumber.put(_key214, _val215);
          }
        }
        struct.setSectionStudentNumberIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list217 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(_list217.size);
          int _elem218;
          for (int _i219 = 0; _i219 < _list217.size; ++_i219)
          {
            _elem218 = iprot.readI32();
            struct.maxAndMinClassStudentNumber.add(_elem218);
          }
        }
        struct.setMaxAndMinClassStudentNumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.runing_time = iprot.readI32();
        struct.setRuning_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
