package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class WhiteSpace extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Facet implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Fixed = new javax.xml.namespace.QName( "", "fixed", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Value = new javax.xml.namespace.QName( "", "value", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public WhiteSpace() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected WhiteSpace( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  public java.lang.Boolean Fixed() {
    return (java.lang.Boolean) TYPE.get().getTypeInfo().getProperty( "Fixed" ).getAccessor().getValue( this );
  }

  public void setFixed$( java.lang.Boolean param ) {
    TYPE.get().getTypeInfo().getProperty( "Fixed" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  @Deprecated
  public java.lang.String Value() {
    return super.Value();
  }

  @Deprecated
  public void setValue$( java.lang.String param ) {
    super.setValue$( param );
  }

  public gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value Value$$gw_xsd_w3c_xmlschema_anonymous_types_complex_WhiteSpace() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value) TYPE.get().getTypeInfo().getProperty( "Value" ).getAccessor().getValue( this );
  }

  public void setValue$$gw_xsd_w3c_xmlschema_anonymous_types_complex_WhiteSpace$( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value param ) {
    TYPE.get().getTypeInfo().getProperty( "Value" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -3788403261967307401L;

}
