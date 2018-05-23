/**
 * Resultado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.servicios.www.pagos.schemas;

public class Resultado  implements java.io.Serializable {
    private co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura;

    private java.lang.String mensaje;

    public Resultado() {
    }

    public Resultado(
           co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura,
           java.lang.String mensaje) {
           this.referenciaFactura = referenciaFactura;
           this.mensaje = mensaje;
    }


    /**
     * Gets the referenciaFactura value for this Resultado.
     * 
     * @return referenciaFactura
     */
    public co.servicios.www.pagos.schemas.ReferenciaFactura getReferenciaFactura() {
        return referenciaFactura;
    }


    /**
     * Sets the referenciaFactura value for this Resultado.
     * 
     * @param referenciaFactura
     */
    public void setReferenciaFactura(co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura) {
        this.referenciaFactura = referenciaFactura;
    }


    /**
     * Gets the mensaje value for this Resultado.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Resultado.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Resultado)) return false;
        Resultado other = (Resultado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenciaFactura==null && other.getReferenciaFactura()==null) || 
             (this.referenciaFactura!=null &&
              this.referenciaFactura.equals(other.getReferenciaFactura()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReferenciaFactura() != null) {
            _hashCode += getReferenciaFactura().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Resultado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "Resultado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciaFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "referenciaFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "ReferenciaFactura"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
