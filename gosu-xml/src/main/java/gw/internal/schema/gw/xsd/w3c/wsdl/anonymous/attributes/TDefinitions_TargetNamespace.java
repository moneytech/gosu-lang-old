package gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.attributes;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class TDefinitions_TargetNamespace implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "targetNamespace", "" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.wsdl.anonymous.attributes.TDefinitions_TargetNamespace" );
          }
        };

  private TDefinitions_TargetNamespace() {
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( java.net.URI value ) {
    //noinspection RedundantArrayCreation
    return (gw.xml.XmlSimpleValue) TYPE.get().getTypeInfo().getMethod( "createSimpleValue", gw.lang.reflect.TypeSystem.get( java.net.URI.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { value } );
  }

  public static void set( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType anyType, java.net.URI value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType.class ), gw.lang.reflect.TypeSystem.get( java.net.URI.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { anyType, value } );
  }

  public static void set( gw.xml.XmlElement element, java.net.URI value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.xml.XmlElement.class ), gw.lang.reflect.TypeSystem.get( java.net.URI.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { element, value } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 3737049672341785483L;

}
