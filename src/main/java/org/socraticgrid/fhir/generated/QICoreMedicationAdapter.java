package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreMedication;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationAdapter implements IQICoreMedication
{

   private Medication adaptedClass = null;

   public QICoreMedicationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Medication();
   }

   public QICoreMedicationAdapter(Medication adaptee)
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

   public Medication.Product getProduct()
   {
      return adaptedClass.getProduct();
   }

   public IQICoreMedication setProduct(Medication.Product param)
   {
      adaptedClass.setProduct(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreMedication setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreMedication setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public Medication.Package getPackage()
   {
      return adaptedClass.getPackage();
   }

   public IQICoreMedication setPackage(Medication.Package param)
   {
      adaptedClass.setPackage(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreMedication setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public QICoreOrganizationAdapter getManufacturerResource()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
                     .getManufacturer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedication setManufacturerResource(
         QICoreOrganizationAdapter param)
   {
      adaptedClass.getManufacturer().setResource(param.getAdaptee());
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreMedication setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public BooleanDt getIsBrandElement()
   {
      return adaptedClass.getIsBrandElement();
   }

   public Boolean getIsBrand()
   {
      return adaptedClass.getIsBrand();
   }

   public IQICoreMedication setIsBrand(Boolean param)
   {
      adaptedClass
            .setIsBrand(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IQICoreMedication setIsBrand(BooleanDt param)
   {
      adaptedClass.setIsBrand(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreMedication setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}