package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.util.List;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorepatientTelecomAdapter
{

   private ContactPoint adaptedClass;

   public qicorepatientTelecomAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.ContactPoint();
   }

   public qicorepatientTelecomAdapter(ContactPoint adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ContactPoint getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ContactPoint param)
   {
      this.adaptedClass = param;
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

   public qicorepatientTelecomAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicorepatientTelecomAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
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

   public qicorepatientTelecomAdapter setPeriod(Period param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public boolean hasPeriod()
   {
      return adaptedClass.hasPeriod();
   }

   public boolean hasUse()
   {
      return adaptedClass.hasUse();
   }

   public boolean hasUseElement()
   {
      return adaptedClass.hasUseElement();
   }

   public ContactPoint.ContactPointUse getUse()
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

   public Enumeration<ContactPoint.ContactPointUse> getUseElement()
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

   public qicorepatientTelecomAdapter setUse(ContactPoint.ContactPointUse param)
   {
      adaptedClass.setUse(param);
      return this;
   }

   public qicorepatientTelecomAdapter setUseElement(
         Enumeration<ContactPoint.ContactPointUse> param)
   {
      adaptedClass.setUseElement(param);
      return this;
   }

   public boolean hasSystem()
   {
      return adaptedClass.hasSystem();
   }

   public boolean hasSystemElement()
   {
      return adaptedClass.hasSystemElement();
   }

   public ContactPoint.ContactPointSystem getSystem()
   {
      try
      {
         return adaptedClass.getSystem();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting System", e);
      }
   }

   public Enumeration<ContactPoint.ContactPointSystem> getSystemElement()
   {
      try
      {
         return adaptedClass.getSystemElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SystemElement", e);
      }
   }

   public qicorepatientTelecomAdapter setSystem(
         ContactPoint.ContactPointSystem param)
   {
      adaptedClass.setSystem(param);
      return this;
   }

   public qicorepatientTelecomAdapter setSystemElement(
         Enumeration<ContactPoint.ContactPointSystem> param)
   {
      adaptedClass.setSystemElement(param);
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

   public qicorepatientTelecomAdapter setPreferred(BooleanType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/iso21090-preferred")
            .setValue(param);
      return this;
   }

   public boolean hasValue()
   {
      return adaptedClass.hasValue();
   }

   public boolean hasValueElement()
   {
      return adaptedClass.hasValueElement();
   }

   public StringType getValueElement()
   {
      try
      {
         return adaptedClass.getValueElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueElement", e);
      }
   }

   public String getValue()
   {
      try
      {
         return adaptedClass.getValue();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Value", e);
      }
   }

   public qicorepatientTelecomAdapter setValueElement(StringType param)
   {
      adaptedClass.setValueElement(param);
      return this;
   }

   public qicorepatientTelecomAdapter setValue(String param)
   {
      adaptedClass.setValue(param);
      return this;
   }
}