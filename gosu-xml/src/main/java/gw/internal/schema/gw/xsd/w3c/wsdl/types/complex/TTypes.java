package gw.internal.schema.gw.xsd.w3c.wsdl.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class TTypes extends gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TExtensibleDocumented implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Documentation = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "documentation", "wsdl" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "tTypes", "wsdl" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.wsdl.types.complex.TTypes" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public TTypes() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected TTypes( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation Documentation() {
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation) TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().getValue( this );
  }

  public void setDocumentation$( gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation param ) {
    TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 3737049672341785483L;

}
