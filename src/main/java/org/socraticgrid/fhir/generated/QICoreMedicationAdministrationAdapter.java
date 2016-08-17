package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreMedicationAdministration;
import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationAdministrationAdapter implements IQICoreMedicationAdministration
{

   private MedicationAdministration adaptedClass = null;

   public QICoreMedicationAdministrationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationAdministration();
   }

   public QICoreMedicationAdministrationAdapter(
         MedicationAdministration adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationAdministration getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationAdministration param)
   {
      this.adaptedClass = param;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreMedicationAdministration setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreMedicationAdministration setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setPatientResource(
         QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public MedicationAdministration.Dosage getDosage()
   {
      return adaptedClass.getDosage();
   }

   public IQICoreMedicationAdministration setDosage(
         MedicationAdministration.Dosage param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public StringDt getNoteElement()
   {
      return adaptedClass.getNoteElement();
   }

   public String getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreMedicationAdministration setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IQICoreMedicationAdministration setNote(StringDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public BooleanDt getWasNotGivenElement()
   {
      return adaptedClass.getWasNotGivenElement();
   }

   public Boolean getWasNotGiven()
   {
      return adaptedClass.getWasNotGiven();
   }

   public IQICoreMedicationAdministration setWasNotGiven(Boolean param)
   {
      adaptedClass.setWasNotGiven(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IQICoreMedicationAdministration setWasNotGiven(BooleanDt param)
   {
      adaptedClass.setWasNotGiven(param);
      return this;
   }

   public DateTimeDt getEffectiveTimeDateTimeElement()
   {
      if (adaptedClass.getEffectiveTime() != null
            && adaptedClass.getEffectiveTime() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffectiveTime();
      }
      else
      {
         return null;
      }
   }

   public Date getEffectiveTimeDateTime()
   {
      if (adaptedClass.getEffectiveTime() != null
            && adaptedClass.getEffectiveTime() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffectiveTime()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setEffectiveTimeDateTime(
         DateTimeDt param)
   {
      adaptedClass.setEffectiveTime(param);
      return this;
   }

   public IQICoreMedicationAdministration setEffectiveTimeDateTime(Date param)
   {
      adaptedClass
            .setEffectiveTime(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public PeriodDt getEffectiveTimePeriod()
   {
      if (adaptedClass.getEffectiveTime() != null
            && adaptedClass.getEffectiveTime() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getEffectiveTime();
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setEffectiveTimePeriod(PeriodDt param)
   {
      adaptedClass.setEffectiveTime(param);
      return this;
   }

   public BoundCodeableConceptDt getMedicationCodeableConcept()
   {
      if (adaptedClass.getMedication() != null
            && adaptedClass.getMedication() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getMedication();
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setMedicationCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public ResourceReferenceDt getMedicationReference()
   {
      if (adaptedClass.getMedication() != null
            && adaptedClass.getMedication() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getMedication();
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setMedicationReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreMedicationAdministration setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreMedicationAdministration setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreMedicationAdministration setIdentifier(
         List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreMedicationAdministration addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreMedicationAdministration setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreMedicationAdministration setStatus(
         MedicationAdministrationStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationAdministrationStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreMedicationAdministration setStatus(
         BoundCodeDt<MedicationAdministrationStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public QICoreMedicationOrderAdapter getPrescriptionResource()
   {
      if (adaptedClass.getPrescription().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.MedicationOrder)
      {
         org.socraticgrid.fhir.generated.QICoreMedicationOrderAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreMedicationOrderAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.MedicationOrder) adaptedClass
                     .getPrescription().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationAdministration setPrescriptionResource(
         QICoreMedicationOrderAdapter param)
   {
      adaptedClass.getPrescription().setResource(param.getAdaptee());
      return this;
   }
}