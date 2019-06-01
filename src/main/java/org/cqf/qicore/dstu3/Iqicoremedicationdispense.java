package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import java.lang.String;

import org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent;
import org.hl7.fhir.dstu3.model.Dosage;

public interface Iqicoremedicationdispense
{

   public MedicationDispense getAdaptee();

   public void setAdaptee(MedicationDispense param);

   public IntegerType getRefillsRemaining();

   public Iqicoremedicationdispense setRefillsRemaining(IntegerType param);

   public boolean hasPerformer();

   public List<MedicationDispense.MedicationDispensePerformerComponent> getPerformer();

   public Iqicoremedicationdispense setPerformer(List<MedicationDispense.MedicationDispensePerformerComponent> param);

   public List<Annotation> getNote();

   public Iqicoremedicationdispense setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoremedicationdispense addNote(Annotation param);

   public Annotation addNote();

   public List<qicoremedicationdispenseDosageInstructionAdapter> getWrappedDosageInstruction();

   public Iqicoremedicationdispense setWrappedDosageInstruction(
         List<qicoremedicationdispenseDosageInstructionAdapter> param);

   public Iqicoremedicationdispense addWrappedDosageInstruction(
         qicoremedicationdispenseDosageInstructionAdapter param);

   public qicoremedicationdispenseDosageInstructionAdapter addWrappedDosageInstruction();

   public List<Dosage> getDosageInstruction();

   public Iqicoremedicationdispense setDosageInstruction(
         List<Dosage> param);

   public boolean hasDosageInstruction();

   public Iqicoremedicationdispense addDosageInstruction(
		   Dosage param);

   public Dosage addDosageInstruction();

   public List<Resource> getContained();

   public Iqicoremedicationdispense setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedicationdispense addContained(Resource param);

   public boolean hasAuthorizingPrescription();

   public List<Reference> getAuthorizingPrescription();

   public List<Reference> getEventHistory();

   public qicoremedicationdispenseAdapter setEventHistory(
		   List<Reference> param);

   public boolean hasEventHistory();

   public qicoremedicationdispenseAdapter addEventHistory(
         Reference param);

   public Reference addEventHistory();

   public boolean hasStatus();

   public boolean hasStatusElement();

   public MedicationDispense.MedicationDispenseStatus getStatus();

   public Enumeration<MedicationDispense.MedicationDispenseStatus> getStatusElement();

   public Iqicoremedicationdispense setStatus(
         MedicationDispense.MedicationDispenseStatus param);

   public Iqicoremedicationdispense setStatusElement(
         Enumeration<MedicationDispense.MedicationDispenseStatus> param);

   public SimpleQuantity getDaysSupply();

   public Iqicoremedicationdispense setDaysSupply(SimpleQuantity param);

   public boolean hasDaysSupply();

   public MedicationDispenseSubstitutionComponent getSubstitution();

   public qicoremedicationdispenseAdapter setSubstitution(
		   MedicationDispenseSubstitutionComponent param);

   public boolean hasSubstitution();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedicationdispense setLanguageElement(CodeType param);

   public Iqicoremedicationdispense setLanguage(String param);

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoremedicationdispense setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoremedicationdispense setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoremedicationdispense setPatientAdapterTarget(
         qicorepatientAdapter param);

   public SimpleQuantity getQuantity();

   public Iqicoremedicationdispense setQuantity(SimpleQuantity param);

   public boolean hasQuantity();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedicationdispense setIdElement(IdType param);

   public Iqicoremedicationdispense setId(String param);

   public boolean hasReceiver();

   public List<Patient> getReceiverPatientTarget();

   public List<Reference> getReceiver();

   public List<Practitioner> getReceiverPractitionerTarget();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedicationdispense setImplicitRulesElement(UriType param);

   public Iqicoremedicationdispense setImplicitRules(String param);

   public Period getValidityPeriod();

   public Iqicoremedicationdispense setValidityPeriod(Period param);

   public CodeableConcept getType();

   public Iqicoremedicationdispense setType(CodeableConcept param);

   public boolean hasType();

   public List<Identifier> getIdentifier();

   public Iqicoremedicationdispense setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public boolean hasDestination();

   public Reference getDestination();

   public Iqicoremedicationdispense setDestination(Reference param);

   public Location getDestinationTarget();

   public Iqicoremedicationdispense setDestinationTarget(Location param);

   public qicorelocationAdapter getDestinationAdapterTarget();

   public Iqicoremedicationdispense setDestinationAdapterTarget(
         qicorelocationAdapter param);

   public Type getMedication();

   public Iqicoremedicationdispense setMedication(Type param);

   public CodeableConcept getMedicationCodeableConcept();

   public boolean hasMedicationCodeableConcept();

   public boolean hasMedication();

   public Reference getMedicationReference();

   public Medication getMedicationTarget();

   public Iqicoremedicationdispense setMedication(Reference param);

   public Iqicoremedicationdispense setMedicationTarget(Medication param);
}
