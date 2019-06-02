package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;

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
import org.hl7.fhir.dstu3.model.MedicationRequest;
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

   public List<MedicationAdministration.MedicationAdministrationPerformerComponent> getPerformer()
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

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public Iqicoremedicationadministration setPerformer(List<MedicationAdministration.MedicationAdministrationPerformerComponent> param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public List<Reference> getEventHistory()
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
         List<Reference> param)
   {
      adaptedClass.setEventHistory(param);
      return this;
   }

   public boolean hasEventHistory()
   {
      return adaptedClass.hasEventHistory();
   }

   public qicoremedicationadministrationAdapter addEventHistory(
         Reference param)
   {
      adaptedClass.addEventHistory(param);
      return this;
   }

   public Reference addEventHistory()
   {
      return adaptedClass.addEventHistory();
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoremedicationadministration setPatient(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoremedicationadministration setPatientTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getSubject().getResource());
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
      adaptedClass.setSubjectTarget(param.getAdaptee());
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

   public List<CodeableConcept> getReasonCode()
   {
      try
      {
         return adaptedClass.getReasonCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonGiven", e);
      }
   }

   public Iqicoremedicationadministration setReasonCode(
         List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonGiven()
   {
      return adaptedClass.hasReasonCode();
   }

   public Iqicoremedicationadministration addReasonCode(CodeableConcept param)
   {
      adaptedClass.addReasonCode(param);
      return this;
   }

   public CodeableConcept addReasonCode()
   {
      return adaptedClass.addReasonCode();
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

   public Type getEffective()
   {
      try
      {
         return adaptedClass.getEffective();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectiveTime", e);
      }
   }

   public Iqicoremedicationadministration setEffective(Type param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public DateTimeType getEffectiveDateTimeType()
   {
      try
      {
         return adaptedClass.getEffectiveDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting EffectiveTimeDateTimeType", e);
      }
   }

   public boolean hasEffectiveDateTimeType()
   {
      return adaptedClass.hasEffectiveDateTimeType();
   }

   public Period getEffectivePeriod()
   {
      try
      {
         return adaptedClass.getEffectivePeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectiveTimePeriod", e);
      }
   }

   public boolean hasEffectivePeriod()
   {
      return adaptedClass.hasEffectivePeriod();
   }

   public boolean hasNotGiven()
   {
      return adaptedClass.hasNotGiven();
   }

   public boolean hasNotGivenElement()
   {
      return adaptedClass.hasNotGivenElement();
   }

   public BooleanType getNotGivenElement()
   {
      try
      {
         return adaptedClass.getNotGivenElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGivenElement", e);
      }
   }

   public Boolean getNotGiven()
   {
      try
      {
         return adaptedClass.getNotGiven();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGiven", e);
      }
   }

   public Iqicoremedicationadministration setNotGivenElement(
         BooleanType param)
   {
      adaptedClass.setNotGivenElement(param);
      return this;
   }

   public Iqicoremedicationadministration setNotGiven(Boolean param)
   {
      adaptedClass.setNotGiven(param);
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
      return adaptedClass.hasContext();
   }

   public Reference getEncounter()
   {
      try
      {
         return adaptedClass.getContext();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoremedicationadministration setEncounter(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicoremedicationadministration setEncounterTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getContext().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         qicoreencounterAdapter profiledType = new qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getContext().getResource());
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
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public MedicationRequest getPrescriptionTarget()
   {
      return (org.hl7.fhir.dstu3.model.MedicationRequest) adaptedClass
            .getPrescriptionTarget();
   }

   public Iqicoremedicationadministration setPrescriptionTarget(
         MedicationRequest param)
   {
      adaptedClass.setPrescriptionTarget(param);
      return this;
   }

   public qicoremedicationrequestAdapter getPrescriptionAdapterTarget()
   {
      if (adaptedClass.getPrescription().getResource() instanceof org.hl7.fhir.dstu3.model.MedicationRequest)
      {
         qicoremedicationrequestAdapter profiledType = new qicoremedicationrequestAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.MedicationRequest) adaptedClass
                     .getPrescription().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationadministration setPrescriptionAdapterTarget(
         qicoremedicationrequestAdapter param)
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
