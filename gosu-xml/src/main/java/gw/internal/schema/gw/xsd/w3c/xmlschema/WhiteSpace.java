package gw.internal.schema.gw.xsd.w3c.xmlschema;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class WhiteSpace extends gw.xml.XmlElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Fixed = new javax.xml.namespace.QName( "", "fixed", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Value = new javax.xml.namespace.QName( "", "value", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "whiteSpace", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.WhiteSpace" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPEINSTANCETYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace" );
          }
        };

  public WhiteSpace() {
    this( new gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace() );
  }

  public WhiteSpace( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace typeInstance ) {
    super( $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  protected WhiteSpace( javax.xml.namespace.QName qname, gw.lang.reflect.IType type, gw.lang.reflect.IType schemaDefinedTypeInstanceType, gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( qname, type, schemaDefinedTypeInstanceType, typeInstance );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace getTypeInstance() {
    //noinspection RedundantCast
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace) super.getTypeInstance();
  }

  public void setTypeInstance( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex.WhiteSpace param ) {
    super.setTypeInstance( param );
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


  public gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value Value() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value) TYPE.get().getTypeInfo().getProperty( "Value" ).getAccessor().getValue( this );
  }

  public void setValue$( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.WhiteSpace_Value param ) {
    TYPE.get().getTypeInfo().getProperty( "Value" ).getAccessor().setValue( this, param );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( byte[] byteArray ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( byte[] byteArray, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.File file ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.InputStream inputStream ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.InputStream inputStream, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.Reader reader ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.lang.String xmlString ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.net.URL url ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.WhiteSpace) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url, options } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -3788403261967307401L;

}
