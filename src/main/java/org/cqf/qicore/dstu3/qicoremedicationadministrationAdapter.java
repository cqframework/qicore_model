package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.MedicationOrder;
import org.hl7.fhir.dstu3.model.UriType;

public class qicoremedicationadministrationAdapter implements Iqicoremedicationadministration
{

   private MedicationAdministration adaptedClass;

   public qicoremedicationadministrationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.MedicationAdministration();
   }

   public qicoremedicationadministrationAdapter(
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

   public MedicationAdministration.MedicationAdministrationDosageComponent getDosage()
   {
      try
      {
         return adaptedClass.getDosage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Dosage", e);
      }
   }

   public qicoremedicationadministrationAdapter setDosage(
         MedicationAdministration.MedicationAdministrationDosageComponent param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public boolean hasDosage()
   {
      return adaptedClass.hasDosage();
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

   public Iqicoremedicationadministration setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedicationadministration setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Reference getPerformer()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Resource getPerformerTarget()
   {
      try
      {
         return adaptedClass.getPerformerTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformerTarget", e);
      }
   }

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public Reference getPerformerPractitioner()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Iqicoremedicationadministration setPerformer(Reference param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public Practitioner getPerformerPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoremedicationadministration setPerformerTarget(Practitioner param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getPerformerPractitionerAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPerformerAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public Reference getPerformerPatient()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Patient getPerformerPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoremedicationadministration setPerformerTarget(Patient param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepatientAdapter getPerformerPatientAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPerformerAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public Reference getPerformerRelatedPerson()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public RelatedPerson getPerformerRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoremedicationadministration setPerformerTarget(
         RelatedPerson param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getPerformerRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         qicorerelatedpersonAdapter profiledType = new qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPerformerAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public List<MedicationAdministration.MedicationAdministrationEventHistoryComponent> getEventHistory()
   {
      try
      {
         return adaptedClass.getEventHistory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EventHistory", e);
      }
   }

   public qicoremedicationadministrationAdapter setEventHistory(
         List<MedicationAdministration.MedicationAdministrationEventHistoryComponent> param)
   {
      adaptedClass.setEventHistory(param);
      return this;
   }

   public boolean hasEventHistory()
   {
      return adaptedClass.hasEventHistory();
   }

   public qicoremedicationadministrationAdapter addEventHistory(
         MedicationAdministration.MedicationAdministrationEventHistoryComponent param)
   {
      adaptedClass.addEventHistory(param);
      return this;
   }

   public MedicationAdministration.MedicationAdministrationEventHistoryComponent addEventHistory()
   {
      return adaptedClass.addEventHistory();
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasPatient();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getPatient();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoremedicationadministration setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoremedicationadministration setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public List<CodeableConcept> getReasonNotGiven()
   {
      try
      {
         return adaptedClass.getReasonNotGiven();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonNotGiven", e);
      }
   }

   public Iqicoremedicationadministration setReasonNotGiven(
         List<CodeableConcept> param)
   {
      adaptedClass.setReasonNotGiven(param);
      return this;
   }

   public boolean hasReasonNotGiven()
   {
      return adaptedClass.hasReasonNotGiven();
   }

   public Iqicoremedicationadministration addReasonNotGiven(
         CodeableConcept param)
   {
      adaptedClass.addReasonNotGiven(param);
      return this;
   }

   public CodeableConcept addReasonNotGiven()
   {
      return adaptedClass.addReasonNotGiven();
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public Iqicoremedicationadministration setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoremedicationadministration addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public List<CodeableConcept> getReasonGiven()
   {
      try
      {
         return adaptedClass.getReasonGiven();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonGiven", e);
      }
   }

   public Iqicoremedicationadministration setReasonGiven(
         List<CodeableConcept> param)
   {
      adaptedClass.setReasonGiven(param);
      return this;
   }

   public boolean hasReasonGiven()
   {
      return adaptedClass.hasReasonGiven();
   }

   public Iqicoremedicationadministration addReasonGiven(CodeableConcept param)
   {
      adaptedClass.addReasonGiven(param);
      return this;
   }

   public CodeableConcept addReasonGiven()
   {
      return adaptedClass.addReasonGiven();
   }

   public Type getMedication()
   {
      try
      {
         return adaptedClass.getMedication();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Medication", e);
      }
   }

   public Iqicoremedicationadministration setMedication(Type param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public CodeableConcept getMedicationCodeableConcept()
   {
      try
      {
         return adaptedClass.getMedicationCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting MedicationCodeableConcept", e);
      }
   }

   public boolean hasMedicationCodeableConcept()
   {
      return adaptedClass.hasMedicationCodeableConcept();
   }

   public boolean hasMedication()
   {
      return adaptedClass.hasMedication();
   }

   public Reference getMedicationReference()
   {
      try
      {
         return adaptedClass.getMedicationReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MedicationReference", e);
      }
   }

   public Medication getMedicationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Medication) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getMedication()).getResource();
   }

   public Iqicoremedicationadministration setMedication(Reference param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public Iqicoremedicationadministration setMedicationTarget(Medication param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setMedication(reference);
      return this;
   }

   public Type getEffectiveTime()
   {
      try
      {
         return adaptedClass.getEffectiveTime();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectiveTime", e);
      }
   }

   public Iqicoremedicationadministration setEffectiveTime(Type param)
   {
      adaptedClass.setEffectiveTime(param);
      return this;
   }

   public DateTimeType getEffectiveTimeDateTimeType()
   {
      try
      {
         return adaptedClass.getEffectiveTimeDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting EffectiveTimeDateTimeType", e);
      }
   }

   public boolean hasEffectiveTimeDateTimeType()
   {
      return adaptedClass.hasEffectiveTimeDateTimeType();
   }

   public Period getEffectiveTimePeriod()
   {
      try
      {
         return adaptedClass.getEffectiveTimePeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectiveTimePeriod", e);
      }
   }

   public boolean hasEffectiveTimePeriod()
   {
      return adaptedClass.hasEffectiveTimePeriod();
   }

   public boolean hasWasNotGiven()
   {
      return adaptedClass.hasWasNotGiven();
   }

   public boolean hasWasNotGivenElement()
   {
      return adaptedClass.hasWasNotGivenElement();
   }

   public BooleanType getWasNotGivenElement()
   {
      try
      {
         return adaptedClass.getWasNotGivenElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGivenElement", e);
      }
   }

   public Boolean getWasNotGiven()
   {
      try
      {
         return adaptedClass.getWasNotGiven();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGiven", e);
      }
   }

   public Iqicoremedicationadministration setWasNotGivenElement(
         BooleanType param)
   {
      adaptedClass.setWasNotGivenElement(param);
      return this;
   }

   public Iqicoremedicationadministration setWasNotGiven(Boolean param)
   {
      adaptedClass.setWasNotGiven(param);
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

   public Iqicoremedicationadministration setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedicationadministration setId(String param)
   {
      adaptedClass.setId(param);
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

   public Iqicoremedicationadministration setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedicationadministration addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public Iqicoremedicationadministration setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoremedicationadministration addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasDevice()
   {
      return adaptedClass.hasDevice();
   }

   public List<Reference> getDevice()
   {
      return adaptedClass.getDevice();
   }

   public boolean hasEncounter()
   {
      return adaptedClass.hasEncounter();
   }

   public Reference getEncounter()
   {
      try
      {
         return adaptedClass.getEncounter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoremedicationadministration setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicoremedicationadministration setEncounterTarget(Encounter param)
   {
      adaptedClass.setEncounterTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getEncounter().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         qicoreencounterAdapter profiledType = new qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public MedicationAdministration.MedicationAdministrationStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<MedicationAdministration.MedicationAdministrationStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicoremedicationadministration setStatus(
         MedicationAdministration.MedicationAdministrationStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoremedicationadministration setStatusElement(
         Enumeration<MedicationAdministration.MedicationAdministrationStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public boolean hasPrescription()
   {
      return adaptedClass.hasPrescription();
   }

   public Reference getPrescription()
   {
      try
      {
         return adaptedClass.getPrescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Prescription", e);
      }
   }

   public Iqicoremedicationadministration setPrescription(Reference param)
   {
      adaptedClass.setPrescription(param);
      return this;
   }

   public MedicationOrder getPrescriptionTarget()
   {
      return (org.hl7.fhir.dstu3.model.MedicationOrder) adaptedClass
            .getPrescriptionTarget();
   }

   public Iqicoremedicationadministration setPrescriptionTarget(
         MedicationOrder param)
   {
      adaptedClass.setPrescriptionTarget(param);
      return this;
   }

   public qicoremedicationorderAdapter getPrescriptionAdapterTarget()
   {
      if (adaptedClass.getPrescription().getResource() instanceof org.hl7.fhir.dstu3.model.MedicationOrder)
      {
         qicoremedicationorderAdapter profiledType = new qicoremedicationorderAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.MedicationOrder) adaptedClass
                     .getPrescription().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPrescriptionAdapterTarget(
         qicoremedicationorderAdapter param)
   {
      adaptedClass.setPrescriptionTarget(param.getAdaptee());
      return this;
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

   public Iqicoremedicationadministration setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedicationadministration setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }
}