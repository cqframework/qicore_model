package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoremedicationdispense;
import org.hl7.fhir.dstu3.model.MedicationDispense;
import org.hl7.fhir.dstu3.model.IntegerType;
import java.util.List;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Annotation;
import org.socraticgrid.fhir.dstu3.generated.qicoremedicationdispenseDosageInstructionAdapter;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.IdType;
import org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoremedicationdispenseAdapter implements Iqicoremedicationdispense
{

   private MedicationDispense adaptedClass;

   public qicoremedicationdispenseAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.MedicationDispense();
   }

   public qicoremedicationdispenseAdapter(MedicationDispense adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationDispense getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationDispense param)
   {
      this.adaptedClass = param;
   }

   public IntegerType getRefillsRemaining()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-refillsRemaining");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.IntegerType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for refillsRemaining");
      }
   }

   public Iqicoremedicationdispense setRefillsRemaining(IntegerType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-refillsRemaining")
            .setValue(param);
      return this;
   }

   public boolean hasDispenser()
   {
      return adaptedClass.hasDispenser();
   }

   public Reference getDispenser()
   {
      try
      {
         return adaptedClass.getDispenser();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Dispenser", e);
      }
   }

   public Iqicoremedicationdispense setDispenser(Reference param)
   {
      adaptedClass.setDispenser(param);
      return this;
   }

   public Practitioner getDispenserTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getDispenserTarget();
   }

   public Iqicoremedicationdispense setDispenserTarget(Practitioner param)
   {
      adaptedClass.setDispenserTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getDispenserAdapterTarget()
   {
      if (adaptedClass.getDispenser().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getDispenser().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationdispense setDispenserAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setDispenserTarget(param.getAdaptee());
      return this;
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

   public Iqicoremedicationdispense setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoremedicationdispense addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public List<qicoremedicationdispenseDosageInstructionAdapter> getWrappedDosageInstruction() {
		List<org.socraticgrid.fhir.dstu3.generated.qicoremedicationdispenseDosageInstructionAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent> items = adaptedClass
				.getDosageInstruction();
		for (org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent item : items) {
			wrappedItems
					.add(new org.socraticgrid.fhir.dstu3.generated.qicoremedicationdispenseDosageInstructionAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicoremedicationdispense setWrappedDosageInstruction(
			List<qicoremedicationdispenseDosageInstructionAdapter> param) {
		List<org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.dstu3.generated.qicoremedicationdispenseDosageInstructionAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getDosageInstruction().addAll(items);
		return this;
	}

   public Iqicoremedicationdispense addWrappedDosageInstruction(
         qicoremedicationdispenseDosageInstructionAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addDosageInstruction(param.getAdaptee());
      }
      return this;
   }

   public qicoremedicationdispenseDosageInstructionAdapter addWrappedDosageInstruction()
   {
      org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent item = new org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent();
      adaptedClass.addDosageInstruction(item);
      return new org.socraticgrid.fhir.dstu3.generated.qicoremedicationdispenseDosageInstructionAdapter(
            item);
   }

   public List<MedicationDispense.MedicationDispenseDosageInstructionComponent> getDosageInstruction()
   {
      try
      {
         return adaptedClass.getDosageInstruction();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DosageInstruction", e);
      }
   }

   public Iqicoremedicationdispense setDosageInstruction(
         List<MedicationDispense.MedicationDispenseDosageInstructionComponent> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public boolean hasDosageInstruction()
   {
      return adaptedClass.hasDosageInstruction();
   }

   public Iqicoremedicationdispense addDosageInstruction(
         MedicationDispense.MedicationDispenseDosageInstructionComponent param)
   {
      adaptedClass.addDosageInstruction(param);
      return this;
   }

   public MedicationDispense.MedicationDispenseDosageInstructionComponent addDosageInstruction()
   {
      return adaptedClass.addDosageInstruction();
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

   public Iqicoremedicationdispense setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedicationdispense addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public boolean hasAuthorizingPrescription()
   {
      return adaptedClass.hasAuthorizingPrescription();
   }

   public List<Reference> getAuthorizingPrescription()
   {
      return adaptedClass.getAuthorizingPrescription();
   }

   public List<MedicationDispense.MedicationDispenseEventHistoryComponent> getEventHistory()
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

   public qicoremedicationdispenseAdapter setEventHistory(
         List<MedicationDispense.MedicationDispenseEventHistoryComponent> param)
   {
      adaptedClass.setEventHistory(param);
      return this;
   }

   public boolean hasEventHistory()
   {
      return adaptedClass.hasEventHistory();
   }

   public qicoremedicationdispenseAdapter addEventHistory(
         MedicationDispense.MedicationDispenseEventHistoryComponent param)
   {
      adaptedClass.addEventHistory(param);
      return this;
   }

   public MedicationDispense.MedicationDispenseEventHistoryComponent addEventHistory()
   {
      return adaptedClass.addEventHistory();
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public MedicationDispense.MedicationDispenseStatus getStatus()
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

   public Enumeration<MedicationDispense.MedicationDispenseStatus> getStatusElement()
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

   public Iqicoremedicationdispense setStatus(
         MedicationDispense.MedicationDispenseStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoremedicationdispense setStatusElement(
         Enumeration<MedicationDispense.MedicationDispenseStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public SimpleQuantity getDaysSupply()
   {
      try
      {
         return adaptedClass.getDaysSupply();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DaysSupply", e);
      }
   }

   public Iqicoremedicationdispense setDaysSupply(SimpleQuantity param)
   {
      adaptedClass.setDaysSupply(param);
      return this;
   }

   public boolean hasDaysSupply()
   {
      return adaptedClass.hasDaysSupply();
   }

   public MedicationDispense.MedicationDispenseSubstitutionComponent getSubstitution()
   {
      try
      {
         return adaptedClass.getSubstitution();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Substitution", e);
      }
   }

   public qicoremedicationdispenseAdapter setSubstitution(
         MedicationDispense.MedicationDispenseSubstitutionComponent param)
   {
      adaptedClass.setSubstitution(param);
      return this;
   }

   public boolean hasSubstitution()
   {
      return adaptedClass.hasSubstitution();
   }

   public boolean hasDispensingOrganization()
   {
      return adaptedClass.hasDispensingOrganization();
   }

   public Reference getDispensingOrganization()
   {
      try
      {
         return adaptedClass.getDispensingOrganization();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DispensingOrganization",
               e);
      }
   }

   public Iqicoremedicationdispense setDispensingOrganization(Reference param)
   {
      adaptedClass.setDispensingOrganization(param);
      return this;
   }

   public Organization getDispensingOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getDispensingOrganizationTarget();
   }

   public Iqicoremedicationdispense setDispensingOrganizationTarget(
         Organization param)
   {
      adaptedClass.setDispensingOrganizationTarget(param);
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

   public Iqicoremedicationdispense setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedicationdispense setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
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

   public Iqicoremedicationdispense setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoremedicationdispense setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
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

   public Iqicoremedicationdispense setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public SimpleQuantity getQuantity()
   {
      try
      {
         return adaptedClass.getQuantity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Quantity", e);
      }
   }

   public Iqicoremedicationdispense setQuantity(SimpleQuantity param)
   {
      adaptedClass.setQuantity(param);
      return this;
   }

   public boolean hasQuantity()
   {
      return adaptedClass.hasQuantity();
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

   public Iqicoremedicationdispense setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedicationdispense setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasReceiver()
   {
      return adaptedClass.hasReceiver();
   }

   public List<Patient> getReceiverPatientTarget() {
		List<org.hl7.fhir.dstu3.model.Patient> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getReceiverTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Patient) resource);
		}
		return items;
	}

   public List<Reference> getReceiver()
   {
      return adaptedClass.getReceiver();
   }

   public List<Practitioner> getReceiverPractitionerTarget() {
		List<org.hl7.fhir.dstu3.model.Practitioner> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getReceiverTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Practitioner) resource);
		}
		return items;
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

   public Iqicoremedicationdispense setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedicationdispense setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public Period getValidityPeriod()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/medicationdispense-validityPeriod");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Period) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for validityPeriod");
      }
   }

   public Iqicoremedicationdispense setValidityPeriod(Period param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/medicationdispense-validityPeriod")
            .setValue(param);
      return this;
   }

   public CodeableConcept getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Iqicoremedicationdispense setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public Identifier getIdentifier()
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

   public Iqicoremedicationdispense setIdentifier(Identifier param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public boolean hasDestination()
   {
      return adaptedClass.hasDestination();
   }

   public Reference getDestination()
   {
      try
      {
         return adaptedClass.getDestination();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Destination", e);
      }
   }

   public Iqicoremedicationdispense setDestination(Reference param)
   {
      adaptedClass.setDestination(param);
      return this;
   }

   public Location getDestinationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getDestinationTarget();
   }

   public Iqicoremedicationdispense setDestinationTarget(Location param)
   {
      adaptedClass.setDestinationTarget(param);
      return this;
   }

   public qicorelocationAdapter getDestinationAdapterTarget()
   {
      if (adaptedClass.getDestination().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getDestination().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationdispense setDestinationAdapterTarget(
         qicorelocationAdapter param)
   {
      adaptedClass.setDestinationTarget(param.getAdaptee());
      return this;
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

   public Iqicoremedicationdispense setMedication(Type param)
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

   public Iqicoremedicationdispense setMedication(Reference param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public Iqicoremedicationdispense setMedicationTarget(Medication param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setMedication(reference);
      return this;
   }
}