package gw.internal.schema.gw.xsd.w3c.soap12_envelope.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Faultreason extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Text = new javax.xml.namespace.QName( "http://www.w3.org/2003/05/soap-envelope", "Text", "soap12" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2003/05/soap-envelope", "faultreason", "soap12" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.soap12_envelope.types.complex.Faultreason" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Faultreason() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Faultreason( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public java.util.List<java.lang.String> Text() {
    //noinspection unchecked
    return (java.util.List<java.lang.String>) TYPE.get().getTypeInfo().getProperty( "Text" ).getAccessor().getValue( this );
  }

  public void setText$( java.util.List<java.lang.String> param ) {
    TYPE.get().getTypeInfo().getProperty( "Text" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Faultreason_Text> Text_elem() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Faultreason_Text>) TYPE.get().getTypeInfo().getProperty( "Text_elem" ).getAccessor().getValue( this );
  }

  public void setText_elem$( java.util.List<gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Faultreason_Text> param ) {
    TYPE.get().getTypeInfo().getProperty( "Text_elem" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 6048722374270687003L;

}
