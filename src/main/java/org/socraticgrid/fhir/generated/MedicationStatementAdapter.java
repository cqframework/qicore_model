package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IMedicationStatement;
import ca.uhn.fhir.model.dstu2.resource.MedicationStatement;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class MedicationStatementAdapter implements IMedicationStatement
{

   private MedicationStatement adaptedClass = null;

   public MedicationStatementAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationStatement();
   }

   public MedicationStatementAdapter(MedicationStatement adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationStatement getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationStatement param)
   {
      this.adaptedClass = param;
   }

   public BoundCodeableConceptDt getReasonForUseCodeableConcept()
   {
      if (adaptedClass.getReasonForUse() != null
            && adaptedClass.getReasonForUse() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getReasonForUse();
      }
      else
      {
         return null;
      }
   }

   public IMedicationStatement setReasonForUseCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setReasonForUse(param);
      return this;
   }

   public ResourceReferenceDt getReasonForUseReference()
   {
      if (adaptedClass.getReasonForUse() != null
            && adaptedClass.getReasonForUse() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getReasonForUse();
      }
      else
      {
         return null;
      }
   }

   public IMedicationStatement setReasonForUseReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setReasonForUse(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IMedicationStatement setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IMedicationStatement addIdentifier(IdentifierDt param)
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

   public StringDt getNoteElement()
   {
      return adaptedClass.getNoteElement();
   }

   public String getNote()
   {
      return adaptedClass.getNote();
   }

   public IMedicationStatement setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IMedicationStatement setNote(StringDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public List<MedicationStatement.Dosage> getDosage()
   {
      return adaptedClass.getDosage();
   }

   public IMedicationStatement setDosage(List<MedicationStatement.Dosage> param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public IMedicationStatement addDosage(MedicationStatement.Dosage param)
   {
      adaptedClass.addDosage(param);
      return this;
   }

   public MedicationStatement.Dosage addDosage()
   {
      ca.uhn.fhir.model.dstu2.resource.MedicationStatement.Dosage item = new ca.uhn.fhir.model.dstu2.resource.MedicationStatement.Dosage();
      adaptedClass.addDosage(item);
      return item;
   }

   public MedicationStatement.Dosage getDosageFirstRep()
   {
      return adaptedClass.getDosageFirstRep();
   }

   public DateTimeDt getDateAssertedElement()
   {
      return adaptedClass.getDateAssertedElement();
   }

   public Date getDateAsserted()
   {
      return adaptedClass.getDateAsserted();
   }

   public IMedicationStatement setDateAsserted(Date param)
   {
      adaptedClass
            .setDateAsserted(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IMedicationStatement setDateAsserted(DateTimeDt param)
   {
      adaptedClass.setDateAsserted(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IMedicationStatement setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IMedicationStatement setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IMedicationStatement setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Patient getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
               .getPatient().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationStatement setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IMedicationStatement setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum
                  .valueOf(param));
      return this;
   }

   public IMedicationStatement setStatus(MedicationStatementStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationStatementStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IMedicationStatement setStatus(
         BoundCodeDt<MedicationStatementStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public DateTimeDt getEffectiveDateTimeElement()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public Date getEffectiveDateTime()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IMedicationStatement setEffectiveDateTime(DateTimeDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public IMedicationStatement setEffectiveDateTime(Date param)
   {
      adaptedClass.setEffective(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getEffectivePeriod()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public IMedicationStatement setEffectivePeriod(PeriodDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IMedicationStatement setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public BooleanDt getWasNotTakenElement()
   {
      return adaptedClass.getWasNotTakenElement();
   }

   public Boolean getWasNotTaken()
   {
      return adaptedClass.getWasNotTaken();
   }

   public IMedicationStatement setWasNotTaken(Boolean param)
   {
      adaptedClass.setWasNotTaken(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IMedicationStatement setWasNotTaken(BooleanDt param)
   {
      adaptedClass.setWasNotTaken(param);
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

   public IMedicationStatement setMedicationCodeableConcept(
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

   public IMedicationStatement setMedicationReference(ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }
}