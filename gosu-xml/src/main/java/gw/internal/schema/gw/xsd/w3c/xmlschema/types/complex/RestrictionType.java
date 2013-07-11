package gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class RestrictionType extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Annotated implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Base = new javax.xml.namespace.QName( "", "base", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_All = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "all", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnyAttribute = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "anyAttribute", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Attribute = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "attribute", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttributeGroup = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "attributeGroup", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Choice = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "choice", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Enumeration = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "enumeration", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FractionDigits = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "fractionDigits", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Group = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "group", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Length = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "length", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaxExclusive = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "maxExclusive", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaxInclusive = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "maxInclusive", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaxLength = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "maxLength", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinExclusive = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "minExclusive", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinInclusive = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "minInclusive", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinLength = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "minLength", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pattern = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "pattern", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Sequence = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "sequence", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SimpleType = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "simpleType", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalDigits = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "totalDigits", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhiteSpace = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "whiteSpace", "xs" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "restrictionType", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.complex.RestrictionType" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public RestrictionType() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected RestrictionType( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.All All() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.All) TYPE.get().getTypeInfo().getProperty( "All" ).getAccessor().getValue( this );
  }

  public void setAll$( gw.internal.schema.gw.xsd.w3c.xmlschema.All param ) {
    TYPE.get().getTypeInfo().getProperty( "All" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.AnyAttribute AnyAttribute() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.AnyAttribute) TYPE.get().getTypeInfo().getProperty( "AnyAttribute" ).getAccessor().getValue( this );
  }

  public void setAnyAttribute$( gw.internal.schema.gw.xsd.w3c.xmlschema.AnyAttribute param ) {
    TYPE.get().getTypeInfo().getProperty( "AnyAttribute" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Attribute> Attribute() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Attribute>) TYPE.get().getTypeInfo().getProperty( "Attribute" ).getAccessor().getValue( this );
  }

  public void setAttribute$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Attribute> param ) {
    TYPE.get().getTypeInfo().getProperty( "Attribute" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_AttributeGroup> AttributeGroup() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_AttributeGroup>) TYPE.get().getTypeInfo().getProperty( "AttributeGroup" ).getAccessor().getValue( this );
  }

  public void setAttributeGroup$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_AttributeGroup> param ) {
    TYPE.get().getTypeInfo().getProperty( "AttributeGroup" ).getAccessor().setValue( this, param );
  }


  public javax.xml.namespace.QName Base() {
    return (javax.xml.namespace.QName) TYPE.get().getTypeInfo().getProperty( "Base" ).getAccessor().getValue( this );
  }

  public void setBase$( javax.xml.namespace.QName param ) {
    TYPE.get().getTypeInfo().getProperty( "Base" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Choice Choice() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Choice) TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().getValue( this );
  }

  public void setChoice$( gw.internal.schema.gw.xsd.w3c.xmlschema.Choice param ) {
    TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Enumeration> Enumeration() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Enumeration>) TYPE.get().getTypeInfo().getProperty( "Enumeration" ).getAccessor().getValue( this );
  }

  public void setEnumeration$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Enumeration> param ) {
    TYPE.get().getTypeInfo().getProperty( "Enumeration" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.FractionDigits> FractionDigits() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.FractionDigits>) TYPE.get().getTypeInfo().getProperty( "FractionDigits" ).getAccessor().getValue( this );
  }

  public void setFractionDigits$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.FractionDigits> param ) {
    TYPE.get().getTypeInfo().getProperty( "FractionDigits" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Group Group() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Group) TYPE.get().getTypeInfo().getProperty( "Group" ).getAccessor().getValue( this );
  }

  public void setGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_Group param ) {
    TYPE.get().getTypeInfo().getProperty( "Group" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Length> Length() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Length>) TYPE.get().getTypeInfo().getProperty( "Length" ).getAccessor().getValue( this );
  }

  public void setLength$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Length> param ) {
    TYPE.get().getTypeInfo().getProperty( "Length" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxExclusive> MaxExclusive() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxExclusive>) TYPE.get().getTypeInfo().getProperty( "MaxExclusive" ).getAccessor().getValue( this );
  }

  public void setMaxExclusive$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxExclusive> param ) {
    TYPE.get().getTypeInfo().getProperty( "MaxExclusive" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxInclusive> MaxInclusive() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxInclusive>) TYPE.get().getTypeInfo().getProperty( "MaxInclusive" ).getAccessor().getValue( this );
  }

  public void setMaxInclusive$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxInclusive> param ) {
    TYPE.get().getTypeInfo().getProperty( "MaxInclusive" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxLength> MaxLength() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxLength>) TYPE.get().getTypeInfo().getProperty( "MaxLength" ).getAccessor().getValue( this );
  }

  public void setMaxLength$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MaxLength> param ) {
    TYPE.get().getTypeInfo().getProperty( "MaxLength" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinExclusive> MinExclusive() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinExclusive>) TYPE.get().getTypeInfo().getProperty( "MinExclusive" ).getAccessor().getValue( this );
  }

  public void setMinExclusive$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinExclusive> param ) {
    TYPE.get().getTypeInfo().getProperty( "MinExclusive" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinInclusive> MinInclusive() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinInclusive>) TYPE.get().getTypeInfo().getProperty( "MinInclusive" ).getAccessor().getValue( this );
  }

  public void setMinInclusive$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinInclusive> param ) {
    TYPE.get().getTypeInfo().getProperty( "MinInclusive" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinLength> MinLength() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinLength>) TYPE.get().getTypeInfo().getProperty( "MinLength" ).getAccessor().getValue( this );
  }

  public void setMinLength$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.MinLength> param ) {
    TYPE.get().getTypeInfo().getProperty( "MinLength" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Pattern> Pattern() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Pattern>) TYPE.get().getTypeInfo().getProperty( "Pattern" ).getAccessor().getValue( this );
  }

  public void setPattern$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Pattern> param ) {
    TYPE.get().getTypeInfo().getProperty( "Pattern" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence Sequence() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().getValue( this );
  }

  public void setSequence$( gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence param ) {
    TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_SimpleType SimpleType() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_SimpleType) TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().getValue( this );
  }

  public void setSimpleType$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.RestrictionType_SimpleType param ) {
    TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.TotalDigits> TotalDigits() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.TotalDigits>) TYPE.get().getTypeInfo().getProperty( "TotalDigits" ).getAccessor().getValue( this );
  }

  public void setTotalDigits$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.TotalDigits> param ) {
    TYPE.get().getTypeInfo().getProperty( "TotalDigits" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace> WhiteSpace() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace>) TYPE.get().getTypeInfo().getProperty( "WhiteSpace" ).getAccessor().getValue( this );
  }

  public void setWhiteSpace$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace> param ) {
    TYPE.get().getTypeInfo().getProperty( "WhiteSpace" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -3788403261967307401L;

}
