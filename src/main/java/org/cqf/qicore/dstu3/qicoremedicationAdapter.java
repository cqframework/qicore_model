package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Resource;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.IdType;

public class qicoremedicationAdapter implements Iqicoremedication
{

   private Medication adaptedClass;

   public qicoremedicationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Medication();
   }

   public qicoremedicationAdapter(Medication adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Medication getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Medication param)
   {
      this.adaptedClass = param;
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicoremedication setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedication setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicoremedication setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedication addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public Medication.MedicationPackageComponent getPackage()
   {
      try
      {
         return adaptedClass.getPackage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Package", e);
      }
   }

   public qicoremedicationAdapter setPackage(
         Medication.MedicationPackageComponent param)
   {
      adaptedClass.setPackage(param);
      return this;
   }

   public boolean hasPackage()
   {
      return adaptedClass.hasPackage();
   }

   public CodeableConcept getCode()
   {
      try
      {
         return adaptedClass.getCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Code", e);
      }
   }

   public Iqicoremedication setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public boolean hasManufacturer()
   {
      return adaptedClass.hasManufacturer();
   }

   public Reference getManufacturer()
   {
      try
      {
         return adaptedClass.getManufacturer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Manufacturer", e);
      }
   }

   public Iqicoremedication setManufacturer(Reference param)
   {
      adaptedClass.setManufacturer(param);
      return this;
   }

   public Organization getManufacturerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getManufacturerTarget();
   }

   public Iqicoremedication setManufacturerTarget(Organization param)
   {
      adaptedClass.setManufacturerTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getManufacturerAdapterTarget()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getManufacturer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedication setManufacturerAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setManufacturerTarget(param.getAdaptee());
      return this;
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicoremedication setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedication setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasIsBrand()
   {
      return adaptedClass.hasIsBrand();
   }

   public boolean hasIsBrandElement()
   {
      return adaptedClass.hasIsBrandElement();
   }

   public BooleanType getIsBrandElement()
   {
      try
      {
         return adaptedClass.getIsBrandElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IsBrandElement", e);
      }
   }

   public Boolean getIsBrand()
   {
      try
      {
         return adaptedClass.getIsBrand();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IsBrand", e);
      }
   }

   public Iqicoremedication setIsBrandElement(BooleanType param)
   {
      adaptedClass.setIsBrandElement(param);
      return this;
   }

   public Iqicoremedication setIsBrand(Boolean param)
   {
      adaptedClass.setIsBrand(param);
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

   public IdType getIdElement()
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

   public Iqicoremedication setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedication setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }
}
