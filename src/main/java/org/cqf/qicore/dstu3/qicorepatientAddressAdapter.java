package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.util.List;
import org.hl7.fhir.dstu3.model.Enumeration;

public class qicorepatientAddressAdapter
{

   private Address adaptedClass;

   public qicorepatientAddressAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Address();
   }

   public qicorepatientAddressAdapter(Address adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Address getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Address param)
   {
      this.adaptedClass = param;
   }

   public Period getPeriod()
   {
      try
      {
         return adaptedClass.getPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Period", e);
      }
   }

   public qicorepatientAddressAdapter setPeriod(Period param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public boolean hasPeriod()
   {
      return adaptedClass.hasPeriod();
   }

   public boolean hasDistrict()
   {
      return adaptedClass.hasDistrict();
   }

   public boolean hasDistrictElement()
   {
      return adaptedClass.hasDistrictElement();
   }

   public StringType getDistrictElement()
   {
      try
      {
         return adaptedClass.getDistrictElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DistrictElement", e);
      }
   }

   public String getDistrict()
   {
      try
      {
         return adaptedClass.getDistrict();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting District", e);
      }
   }

   public qicorepatientAddressAdapter setDistrictElement(StringType param)
   {
      adaptedClass.setDistrictElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setDistrict(String param)
   {
      adaptedClass.setDistrict(param);
      return this;
   }

   public boolean hasText()
   {
      return adaptedClass.hasText();
   }

   public boolean hasTextElement()
   {
      return adaptedClass.hasTextElement();
   }

   public StringType getTextElement()
   {
      try
      {
         return adaptedClass.getTextElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TextElement", e);
      }
   }

   public String getText()
   {
      try
      {
         return adaptedClass.getText();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Text", e);
      }
   }

   public qicorepatientAddressAdapter setTextElement(StringType param)
   {
      adaptedClass.setTextElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setText(String param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public StringType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public qicorepatientAddressAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasCity()
   {
      return adaptedClass.hasCity();
   }

   public boolean hasCityElement()
   {
      return adaptedClass.hasCityElement();
   }

   public StringType getCityElement()
   {
      try
      {
         return adaptedClass.getCityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CityElement", e);
      }
   }

   public String getCity()
   {
      try
      {
         return adaptedClass.getCity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting City", e);
      }
   }

   public qicorepatientAddressAdapter setCityElement(StringType param)
   {
      adaptedClass.setCityElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setCity(String param)
   {
      adaptedClass.setCity(param);
      return this;
   }

   public boolean hasCountry()
   {
      return adaptedClass.hasCountry();
   }

   public boolean hasCountryElement()
   {
      return adaptedClass.hasCountryElement();
   }

   public StringType getCountryElement()
   {
      try
      {
         return adaptedClass.getCountryElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CountryElement", e);
      }
   }

   public String getCountry()
   {
      try
      {
         return adaptedClass.getCountry();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Country", e);
      }
   }

   public qicorepatientAddressAdapter setCountryElement(StringType param)
   {
      adaptedClass.setCountryElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setCountry(String param)
   {
      adaptedClass.setCountry(param);
      return this;
   }

   public boolean hasState()
   {
      return adaptedClass.hasState();
   }

   public boolean hasStateElement()
   {
      return adaptedClass.hasStateElement();
   }

   public StringType getStateElement()
   {
      try
      {
         return adaptedClass.getStateElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StateElement", e);
      }
   }

   public String getState()
   {
      try
      {
         return adaptedClass.getState();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting State", e);
      }
   }

   public qicorepatientAddressAdapter setStateElement(StringType param)
   {
      adaptedClass.setStateElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setState(String param)
   {
      adaptedClass.setState(param);
      return this;
   }

   public boolean hasPostalCode()
   {
      return adaptedClass.hasPostalCode();
   }

   public boolean hasPostalCodeElement()
   {
      return adaptedClass.hasPostalCodeElement();
   }

   public StringType getPostalCodeElement()
   {
      try
      {
         return adaptedClass.getPostalCodeElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PostalCodeElement", e);
      }
   }

   public String getPostalCode()
   {
      try
      {
         return adaptedClass.getPostalCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PostalCode", e);
      }
   }

   public qicorepatientAddressAdapter setPostalCodeElement(StringType param)
   {
      adaptedClass.setPostalCodeElement(param);
      return this;
   }

   public qicorepatientAddressAdapter setPostalCode(String param)
   {
      adaptedClass.setPostalCode(param);
      return this;
   }

   public BooleanType getPreferred()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/iso21090-preferred");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.BooleanType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for preferred");
      }
   }

   public qicorepatientAddressAdapter setPreferred(BooleanType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/iso21090-preferred")
            .setValue(param);
      return this;
   }

   public boolean hasLine()
   {
      return adaptedClass.hasLine();
   }

   public boolean hasLine(String param)
   {
      return adaptedClass.hasLine(param);
   }

   public qicorepatientAddressAdapter addLine(String param)
   {
      adaptedClass.addLine(param);
      return this;
   }

   public StringType addLineElement()
   {
      return adaptedClass.addLineElement();
   }

   public List<StringType> getLine()
   {
      try
      {
         return adaptedClass.getLine();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Line", e);
      }
   }

   public qicorepatientAddressAdapter setLine(List<StringType> param)
   {
      adaptedClass.setLine(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public boolean hasTypeElement()
   {
      return adaptedClass.hasTypeElement();
   }

   public Address.AddressType getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Enumeration<Address.AddressType> getTypeElement()
   {
      try
      {
         return adaptedClass.getTypeElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TypeElement", e);
      }
   }

   public qicorepatientAddressAdapter setType(Address.AddressType param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public qicorepatientAddressAdapter setTypeElement(
         Enumeration<Address.AddressType> param)
   {
      adaptedClass.setTypeElement(param);
      return this;
   }

   public boolean hasUse()
   {
      return adaptedClass.hasUse();
   }

   public boolean hasUseElement()
   {
      return adaptedClass.hasUseElement();
   }

   public Address.AddressUse getUse()
   {
      try
      {
         return adaptedClass.getUse();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Use", e);
      }
   }

   public Enumeration<Address.AddressUse> getUseElement()
   {
      try
      {
         return adaptedClass.getUseElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting UseElement", e);
      }
   }

   public qicorepatientAddressAdapter setUse(Address.AddressUse param)
   {
      adaptedClass.setUse(param);
      return this;
   }

   public qicorepatientAddressAdapter setUseElement(
         Enumeration<Address.AddressUse> param)
   {
      adaptedClass.setUseElement(param);
      return this;
   }
}