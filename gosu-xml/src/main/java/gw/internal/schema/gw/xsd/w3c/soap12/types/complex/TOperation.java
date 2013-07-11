package gw.internal.schema.gw.xsd.w3c.soap12.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class TOperation extends gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TExtensibilityElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Required = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "required", "wsdl" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SoapAction = new javax.xml.namespace.QName( "", "soapAction", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SoapActionRequired = new javax.xml.namespace.QName( "", "soapActionRequired", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Style = new javax.xml.namespace.QName( "", "style", "" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/soap12/", "tOperation", "wsoap12" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.soap12.types.complex.TOperation" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public TOperation() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected TOperation( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public java.lang.Boolean Required() {
    return (java.lang.Boolean) TYPE.get().getTypeInfo().getProperty( "Required" ).getAccessor().getValue( this );
  }

  public void setRequired$( java.lang.Boolean param ) {
    TYPE.get().getTypeInfo().getProperty( "Required" ).getAccessor().setValue( this, param );
  }


  public java.net.URI SoapAction() {
    return (java.net.URI) TYPE.get().getTypeInfo().getProperty( "SoapAction" ).getAccessor().getValue( this );
  }

  public void setSoapAction$( java.net.URI param ) {
    TYPE.get().getTypeInfo().getProperty( "SoapAction" ).getAccessor().setValue( this, param );
  }


  public java.lang.Boolean SoapActionRequired() {
    return (java.lang.Boolean) TYPE.get().getTypeInfo().getProperty( "SoapActionRequired" ).getAccessor().getValue( this );
  }

  public void setSoapActionRequired$( java.lang.Boolean param ) {
    TYPE.get().getTypeInfo().getProperty( "SoapActionRequired" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.soap12.enums.TStyleChoice Style() {
    return (gw.internal.schema.gw.xsd.w3c.soap12.enums.TStyleChoice) TYPE.get().getTypeInfo().getProperty( "Style" ).getAccessor().getValue( this );
  }

  public void setStyle$( gw.internal.schema.gw.xsd.w3c.soap12.enums.TStyleChoice param ) {
    TYPE.get().getTypeInfo().getProperty( "Style" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2359489450031053463L;

}