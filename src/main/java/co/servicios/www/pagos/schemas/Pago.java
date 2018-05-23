/**
 * Pago.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.servicios.www.pagos.schemas;

public class Pago  implements java.io.Serializable {
    private co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura;

    private double totalPagar;

    public Pago() {
    }

    public Pago(
           co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura,
           double totalPagar) {
           this.referenciaFactura = referenciaFactura;
           this.totalPagar = totalPagar;
    }


    /**
     * Gets the referenciaFactura value for this Pago.
     * 
     * @return referenciaFactura
     */
    public co.servicios.www.pagos.schemas.ReferenciaFactura getReferenciaFactura() {
        return referenciaFactura;
    }


    /**
     * Sets the referenciaFactura value for this Pago.
     * 
     * @param referenciaFactura
     */
    public void setReferenciaFactura(co.servicios.www.pagos.schemas.ReferenciaFactura referenciaFactura) {
        this.referenciaFactura = referenciaFactura;
    }


    /**
     * Gets the totalPagar value for this Pago.
     * 
     * @return totalPagar
     */
    public double getTotalPagar() {
        return totalPagar;
    }


    /**
     * Sets the totalPagar value for this Pago.
     * 
     * @param totalPagar
     */
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pago)) return false;
        Pago other = (Pago) obj;
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
            this.totalPagar == other.getTotalPagar();
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
        _hashCode += new Double(getTotalPagar()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pago.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "Pago"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciaFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "referenciaFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "ReferenciaFactura"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPagar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.servicios.co/pagos/schemas", "totalPagar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
