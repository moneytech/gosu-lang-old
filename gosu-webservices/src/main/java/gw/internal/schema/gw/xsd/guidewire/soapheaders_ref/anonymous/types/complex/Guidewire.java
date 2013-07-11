package gw.internal.schema.gw.xsd.guidewire.soapheaders_ref.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Guidewire extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Authentication = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "authentication", "gwsoap" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Locale = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "locale", "gwsoap" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.guidewire.soapheaders_ref.anonymous.types.complex.Guidewire" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Guidewire() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Guidewire( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.guidewire.soapheaders.Authentication Authentication() {
    return (gw.internal.schema.gw.xsd.guidewire.soapheaders.Authentication) TYPE.get().getTypeInfo().getProperty( "Authentication" ).getAccessor().getValue( this );
  }

  public void setAuthentication$( gw.internal.schema.gw.xsd.guidewire.soapheaders.Authentication param ) {
    TYPE.get().getTypeInfo().getProperty( "Authentication" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Locale() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Locale" ).getAccessor().getValue( this );
  }

  public void setLocale$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Locale" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.guidewire.soapheaders.Locale Locale_elem() {
    return (gw.internal.schema.gw.xsd.guidewire.soapheaders.Locale) TYPE.get().getTypeInfo().getProperty( "Locale_elem" ).getAccessor().getValue( this );
  }

  public void setLocale_elem$( gw.internal.schema.gw.xsd.guidewire.soapheaders.Locale param ) {
    TYPE.get().getTypeInfo().getProperty( "Locale_elem" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 6580496032681418251L;

}
