package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreMedicationStatement;
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
import ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationStatementAdapter implements IQICoreMedicationStatement
{

   private MedicationStatement adaptedClass = null;

   public QICoreMedicationStatementAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationStatement();
   }

   public QICoreMedicationStatementAdapter(MedicationStatement adaptee)
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

   public IQICoreMedicationStatement setReasonForUseCodeableConcept(
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

   public IQICoreMedicationStatement setReasonForUseReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setReasonForUse(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreMedicationStatement setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreMedicationStatement addIdentifier(IdentifierDt param)
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

   public IQICoreMedicationStatement setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IQICoreMedicationStatement setNote(StringDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public List<MedicationStatement.Dosage> getDosage()
   {
      return adaptedClass.getDosage();
   }

   public IQICoreMedicationStatement setDosage(
         List<MedicationStatement.Dosage> param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public IQICoreMedicationStatement addDosage(MedicationStatement.Dosage param)
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

   public IQICoreMedicationStatement setDateAsserted(Date param)
   {
      adaptedClass
            .setDateAsserted(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IQICoreMedicationStatement setDateAsserted(DateTimeDt param)
   {
      adaptedClass.setDateAsserted(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreMedicationStatement setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreMedicationStatement setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreMedicationStatement setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
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

   public IQICoreMedicationStatement setPatientResource(
         QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreMedicationStatement setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreMedicationStatement setStatus(
         MedicationStatementStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationStatementStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreMedicationStatement setStatus(
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

   public IQICoreMedicationStatement setEffectiveDateTime(DateTimeDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public IQICoreMedicationStatement setEffectiveDateTime(Date param)
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

   public IQICoreMedicationStatement setEffectivePeriod(PeriodDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreMedicationStatement setContained(ContainedDt param)
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

   public IQICoreMedicationStatement setWasNotTaken(Boolean param)
   {
      adaptedClass.setWasNotTaken(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IQICoreMedicationStatement setWasNotTaken(BooleanDt param)
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

   public IQICoreMedicationStatement setMedicationCodeableConcept(
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

   public IQICoreMedicationStatement setMedicationReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }
}