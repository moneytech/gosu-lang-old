package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.simple;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Wildcard_ProcessContents extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.NMTOKEN implements gw.internal.xml.IXmlGeneratedClass {

  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.types.simple.Wildcard_ProcessContents" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Wildcard_ProcessContents() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Wildcard_ProcessContents( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }

  public Wildcard_ProcessContents( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Wildcard_ProcessContents value ) {
    this();
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, value );
  }


  @Deprecated
  public java.lang.String getValue() {
    return super.getValue();
  }

  @Deprecated
  public void setValue( java.lang.String param ) {
    super.setValue( param );
  }

  public gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Wildcard_ProcessContents getValue$$gw_xsd_w3c_xmlschema_anonymous_types_simple_Wildcard_ProcessContents() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Wildcard_ProcessContents) TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().getValue( this );
  }

  public void setValue$$gw_xsd_w3c_xmlschema_anonymous_types_simple_Wildcard_ProcessContents( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Wildcard_ProcessContents param ) {
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -3788403261967307401L;

}
