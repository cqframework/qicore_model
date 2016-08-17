package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.ICondition;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import java.util.List;
import ca.uhn.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.AgeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ConditionAdapter implements ICondition
{

   private Condition adaptedClass = null;

   public ConditionAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Condition();
   }

   public ConditionAdapter(Condition adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Condition getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Condition param)
   {
      this.adaptedClass = param;
   }

   public List<Condition.Evidence> getEvidence()
   {
      return adaptedClass.getEvidence();
   }

   public ICondition setEvidence(List<Condition.Evidence> param)
   {
      adaptedClass.setEvidence(param);
      return this;
   }

   public ICondition addEvidence(Condition.Evidence param)
   {
      adaptedClass.addEvidence(param);
      return this;
   }

   public Condition.Evidence addEvidence()
   {
      ca.uhn.fhir.model.dstu2.resource.Condition.Evidence item = new ca.uhn.fhir.model.dstu2.resource.Condition.Evidence();
      adaptedClass.addEvidence(item);
      return item;
   }

   public Condition.Evidence getEvidenceFirstRep()
   {
      return adaptedClass.getEvidenceFirstRep();
   }

   public BoundCodeableConceptDt<ConditionCategoryCodesEnum> getCategory()
   {
      return adaptedClass.getCategory();
   }

   public ICondition setCategory(
         BoundCodeableConceptDt<ConditionCategoryCodesEnum> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public ICondition setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public ICondition setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public DateTimeDt getAbatementDateTimeElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public Date getAbatementDateTime()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementDateTime(DateTimeDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public ICondition setAbatementDateTime(Date param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public AgeDt getAbatementQuantity()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.AgeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.AgeDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementQuantity(AgeDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public BooleanDt getAbatementBooleanElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public Boolean getAbatementBoolean()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementBoolean(BooleanDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public ICondition setAbatementBoolean(Boolean param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public PeriodDt getAbatementPeriod()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementPeriod(PeriodDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public RangeDt getAbatementRange()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementRange(RangeDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public StringDt getAbatementStringElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public String getAbatementString()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICondition setAbatementString(StringDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public ICondition setAbatementString(String param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public Condition.Stage getStage()
   {
      return adaptedClass.getStage();
   }

   public ICondition setStage(Condition.Stage param)
   {
      adaptedClass.setStage(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public ICondition setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public StringDt getNotesElement()
   {
      return adaptedClass.getNotesElement();
   }

   public String getNotes()
   {
      return adaptedClass.getNotes();
   }

   public ICondition setNotes(String param)
   {
      adaptedClass.setNotes(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public ICondition setNotes(StringDt param)
   {
      adaptedClass.setNotes(param);
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

   public ICondition setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public ICondition setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public ICondition addIdentifier(IdentifierDt param)
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

   public String getClinicalStatus()
   {
      return adaptedClass.getClinicalStatus();
   }

   public ICondition setClinicalStatus(String param)
   {
      adaptedClass
            .setClinicalStatus(ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum
                  .valueOf(param));
      return this;
   }

   public ICondition setClinicalStatus(ConditionClinicalStatusCodesEnum param)
   {
      adaptedClass.setClinicalStatus(param);
      return this;
   }

   public BoundCodeDt<ConditionClinicalStatusCodesEnum> getClinicalStatusElement()
   {
      return adaptedClass.getClinicalStatusElement();
   }

   public ICondition setClinicalStatus(
         BoundCodeDt<ConditionClinicalStatusCodesEnum> param)
   {
      adaptedClass.setClinicalStatus(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public ICondition setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public ICondition setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConceptDt getSeverity()
   {
      return adaptedClass.getSeverity();
   }

   public ICondition setSeverity(CodeableConceptDt param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }

   public DateDt getDateRecordedElement()
   {
      return adaptedClass.getDateRecordedElement();
   }

   public Date getDateRecorded()
   {
      return adaptedClass.getDateRecorded();
   }

   public ICondition setDateRecorded(Date param)
   {
      adaptedClass.setDateRecorded(new ca.uhn.fhir.model.primitive.DateDt(
            param));
      return this;
   }

   public ICondition setDateRecorded(DateDt param)
   {
      adaptedClass.setDateRecorded(param);
      return this;
   }

   public String getVerificationStatus()
   {
      return adaptedClass.getVerificationStatus();
   }

   public ICondition setVerificationStatus(String param)
   {
      adaptedClass
            .setVerificationStatus(ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum
                  .valueOf(param));
      return this;
   }

   public ICondition setVerificationStatus(
         ConditionVerificationStatusEnum param)
   {
      adaptedClass.setVerificationStatus(param);
      return this;
   }

   public BoundCodeDt<ConditionVerificationStatusEnum> getVerificationStatusElement()
   {
      return adaptedClass.getVerificationStatusElement();
   }

   public ICondition setVerificationStatus(
         BoundCodeDt<ConditionVerificationStatusEnum> param)
   {
      adaptedClass.setVerificationStatus(param);
      return this;
   }

   public DateTimeDt getOnsetDateTimeElement()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public Date getOnsetDateTime()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getOnset()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICondition setOnsetDateTime(DateTimeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public ICondition setOnsetDateTime(Date param)
   {
      adaptedClass
            .setOnset(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public AgeDt getOnsetQuantity()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.AgeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.AgeDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public ICondition setOnsetQuantity(AgeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public PeriodDt getOnsetPeriod()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public ICondition setOnsetPeriod(PeriodDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public RangeDt getOnsetRange()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public ICondition setOnsetRange(RangeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public StringDt getOnsetStringElement()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public String getOnsetString()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getOnset()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICondition setOnsetString(StringDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public ICondition setOnsetString(String param)
   {
      adaptedClass.setOnset(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public ICondition setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }
}