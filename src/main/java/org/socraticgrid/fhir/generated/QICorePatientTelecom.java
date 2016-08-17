package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointUseEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointSystemEnum;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.PositiveIntDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICorePatientTelecom
{

   private ContactPointDt adaptedClass = null;

   public QICorePatientTelecom()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.composite.ContactPointDt();
   }

   public QICorePatientTelecom(ContactPointDt adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ContactPointDt getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ContactPointDt param)
   {
      this.adaptedClass = param;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICorePatientTelecom setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public PeriodDt getPeriod()
   {
      return adaptedClass.getPeriod();
   }

   public QICorePatientTelecom setPeriod(PeriodDt param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public String getUse()
   {
      return adaptedClass.getUse();
   }

   public QICorePatientTelecom setUse(String param)
   {
      adaptedClass
            .setUse(ca.uhn.fhir.model.dstu2.valueset.ContactPointUseEnum
                  .valueOf(param));
      return this;
   }

   public QICorePatientTelecom setUse(ContactPointUseEnum param)
   {
      adaptedClass.setUse(param);
      return this;
   }

   public BoundCodeDt<ContactPointUseEnum> getUseElement()
   {
      return adaptedClass.getUseElement();
   }

   public QICorePatientTelecom setUse(BoundCodeDt<ContactPointUseEnum> param)
   {
      adaptedClass.setUse(param);
      return this;
   }

   public String getSystem()
   {
      return adaptedClass.getSystem();
   }

   public QICorePatientTelecom setSystem(String param)
   {
      adaptedClass
            .setSystem(ca.uhn.fhir.model.dstu2.valueset.ContactPointSystemEnum
                  .valueOf(param));
      return this;
   }

   public QICorePatientTelecom setSystem(ContactPointSystemEnum param)
   {
      adaptedClass.setSystem(param);
      return this;
   }

   public BoundCodeDt<ContactPointSystemEnum> getSystemElement()
   {
      return adaptedClass.getSystemElement();
   }

   public QICorePatientTelecom setSystem(
         BoundCodeDt<ContactPointSystemEnum> param)
   {
      adaptedClass.setSystem(param);
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

   public QICorePatientTelecom setPreferred(BooleanDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/iso21090-preferred",
            param);
      return this;
   }

   public StringDt getValueElement()
   {
      return adaptedClass.getValueElement();
   }

   public String getValue()
   {
      return adaptedClass.getValue();
   }

   public QICorePatientTelecom setValue(String param)
   {
      adaptedClass.setValue(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePatientTelecom setValue(StringDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public PositiveIntDt getRankElement()
   {
      return adaptedClass.getRankElement();
   }

   public Integer getRank()
   {
      return adaptedClass.getRank();
   }

   public QICorePatientTelecom setRank(Integer param)
   {
      adaptedClass.setRank(new ca.uhn.fhir.model.primitive.PositiveIntDt(
            param));
      return this;
   }

   public QICorePatientTelecom setRank(PositiveIntDt param)
   {
      adaptedClass.setRank(param);
      return this;
   }
}