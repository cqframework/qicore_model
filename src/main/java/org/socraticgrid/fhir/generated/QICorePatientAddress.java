package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.valueset.AddressTypeEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICorePatientAddress
{

   private AddressDt adaptedClass = null;

   public QICorePatientAddress()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.composite.AddressDt();
   }

   public QICorePatientAddress(AddressDt adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public AddressDt getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(AddressDt param)
   {
      this.adaptedClass = param;
   }

   public PeriodDt getPeriod()
   {
      return adaptedClass.getPeriod();
   }

   public QICorePatientAddress setPeriod(PeriodDt param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public StringDt getDistrictElement()
   {
      return adaptedClass.getDistrictElement();
   }

   public String getDistrict()
   {
      return adaptedClass.getDistrict();
   }

   public QICorePatientAddress setDistrict(String param)
   {
      adaptedClass
            .setDistrict(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientAddress setDistrict(StringDt param)
   {
      adaptedClass.setDistrict(param);
      return this;
   }

   public StringDt getTextElement()
   {
      return adaptedClass.getTextElement();
   }

   public String getText()
   {
      return adaptedClass.getText();
   }

   public QICorePatientAddress setText(String param)
   {
      adaptedClass.setText(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientAddress setText(StringDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICorePatientAddress setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public StringDt getCityElement()
   {
      return adaptedClass.getCityElement();
   }

   public String getCity()
   {
      return adaptedClass.getCity();
   }

   public QICorePatientAddress setCity(String param)
   {
      adaptedClass.setCity(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientAddress setCity(StringDt param)
   {
      adaptedClass.setCity(param);
      return this;
   }

   public StringDt getCountryElement()
   {
      return adaptedClass.getCountryElement();
   }

   public String getCountry()
   {
      return adaptedClass.getCountry();
   }

   public QICorePatientAddress setCountry(String param)
   {
      adaptedClass
            .setCountry(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientAddress setCountry(StringDt param)
   {
      adaptedClass.setCountry(param);
      return this;
   }

   public StringDt getStateElement()
   {
      return adaptedClass.getStateElement();
   }

   public String getState()
   {
      return adaptedClass.getState();
   }

   public QICorePatientAddress setState(String param)
   {
      adaptedClass.setState(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientAddress setState(StringDt param)
   {
      adaptedClass.setState(param);
      return this;
   }

   public StringDt getPostalCodeElement()
   {
      return adaptedClass.getPostalCodeElement();
   }

   public String getPostalCode()
   {
      return adaptedClass.getPostalCode();
   }

   public QICorePatientAddress setPostalCode(String param)
   {
      adaptedClass.setPostalCode(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public QICorePatientAddress setPostalCode(StringDt param)
   {
      adaptedClass.setPostalCode(param);
      return this;
   }

   public BooleanDt getPreferred()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/iso21090-preferred");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for preferred");
      }
   }

   public QICorePatientAddress setPreferred(BooleanDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/iso21090-preferred",
            param);
      return this;
   }

   public List<StringDt> getLine()
   {
      return adaptedClass.getLine();
   }

   public QICorePatientAddress setLine(List<StringDt> param)
   {
      adaptedClass.setLine(param);
      return this;
   }

   public QICorePatientAddress addLine(StringDt param)
   {
      adaptedClass.addLine(param);
      return this;
   }

   public QICorePatientAddress addLine(String param)
   {
      adaptedClass.addLine(param);
      return this;
   }

   public StringDt addLine()
   {
      ca.uhn.fhir.model.primitive.StringDt item = new ca.uhn.fhir.model.primitive.StringDt();
      adaptedClass.addLine(item);
      return item;
   }

   public String getType()
   {
      return adaptedClass.getType();
   }

   public QICorePatientAddress setType(String param)
   {
      adaptedClass.setType(ca.uhn.fhir.model.dstu2.valueset.AddressTypeEnum
            .valueOf(param));
      return this;
   }

   public QICorePatientAddress setType(AddressTypeEnum param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public BoundCodeDt<AddressTypeEnum> getTypeElement()
   {
      return adaptedClass.getTypeElement();
   }

   public QICorePatientAddress setType(BoundCodeDt<AddressTypeEnum> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public String getUse()
   {
      return adaptedClass.getUse();
   }

   public QICorePatientAddress setUse(String param)
   {
      adaptedClass.setUse(ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum
            .valueOf(param));
      return this;
   }

   public QICorePatientAddress setUse(AddressUseEnum param)
   {
      adaptedClass.setUse(param);
      return this;
   }

   public BoundCodeDt<AddressUseEnum> getUseElement()
   {
      return adaptedClass.getUseElement();
   }

   public QICorePatientAddress setUse(BoundCodeDt<AddressUseEnum> param)
   {
      adaptedClass.setUse(param);
      return this;
   }
}