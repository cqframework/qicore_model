package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationDispense;

import java.util.List;

import org.hl7.fhir.dstu3.model.IntegerType;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.DosageInstruction;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;

public interface Iqicoremedicationdispense
{

   public MedicationDispense getAdaptee();

   public void setAdaptee(MedicationDispense param);

   public IntegerType getRefillsRemaining();

   public Iqicoremedicationdispense setRefillsRemaining(IntegerType param);

   public boolean hasDispenser();

   public Reference getDispenser();

   public Iqicoremedicationdispense setDispenser(Reference param);

   public Practitioner getDispenserTarget();

   public Iqicoremedicationdispense setDispenserTarget(Practitioner param);

   public qicorepractitionerAdapter getDispenserAdapterTarget();

   public Iqicoremedicationdispense setDispenserAdapterTarget(
         qicorepractitionerAdapter param);

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

   public List<DosageInstruction> getDosageInstruction();

   public Iqicoremedicationdispense setDosageInstruction(
         List<DosageInstruction> param);

   public boolean hasDosageInstruction();

   public Iqicoremedicationdispense addDosageInstruction(
		   DosageInstruction param);

   public DosageInstruction addDosageInstruction();

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

   public boolean hasDispensingOrganization();

   public Reference getDispensingOrganization();

   public Iqicoremedicationdispense setDispensingOrganization(Reference param);

   public Organization getDispensingOrganizationTarget();

   public Iqicoremedicationdispense setDispensingOrganizationTarget(
         Organization param);

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

   public Identifier getIdentifier();

   public Iqicoremedicationdispense setIdentifier(Identifier param);

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