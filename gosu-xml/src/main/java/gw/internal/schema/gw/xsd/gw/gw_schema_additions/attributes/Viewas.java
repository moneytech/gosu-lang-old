package gw.internal.schema.gw.xsd.gw.gw_schema_additions.attributes;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Viewas implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/xsd", "viewas", "gw" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.gw.gw_schema_additions.attributes.Viewas" );
          }
        };

  private Viewas() {
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas value ) {
    //noinspection RedundantArrayCreation
    return (gw.xml.XmlSimpleValue) TYPE.get().getTypeInfo().getMethod( "createSimpleValue", gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { value } );
  }

  public static void set( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType anyType, gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType.class ), gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { anyType, value } );
  }

  public static void set( gw.xml.XmlElement element, gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.xml.XmlElement.class ), gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.gw.gw_schema_additions.enums.Viewas.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { element, value } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 8741355091072102811L;

}
