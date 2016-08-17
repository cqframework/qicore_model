package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoreprocedure;
import org.hl7.fhir.dstu3.model.Procedure;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import java.util.List;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CarePlan;
import org.hl7.fhir.dstu3.model.DiagnosticRequest;
import org.hl7.fhir.dstu3.model.ProcedureRequest;
import org.hl7.fhir.dstu3.model.ReferralRequest;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.BodySite;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreprocedureAdapter implements Iqicoreprocedure
{

   private Procedure adaptedClass;

   public qicoreprocedureAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Procedure();
   }

   public qicoreprocedureAdapter(Procedure adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Procedure getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Procedure param)
   {
      this.adaptedClass = param;
   }

   public boolean hasLocation()
   {
      return adaptedClass.hasLocation();
   }

   public Reference getLocation()
   {
      try
      {
         return adaptedClass.getLocation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Location", e);
      }
   }

   public Iqicoreprocedure setLocation(Reference param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public Location getLocationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getLocationTarget();
   }

   public Iqicoreprocedure setLocationTarget(Location param)
   {
      adaptedClass.setLocationTarget(param);
      return this;
   }

   public qicorelocationAdapter getLocationAdapterTarget()
   {
      if (adaptedClass.getLocation().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getLocation().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedure setLocationAdapterTarget(qicorelocationAdapter param)
   {
      adaptedClass.setLocationTarget(param.getAdaptee());
      return this;
   }

   public CodeableConcept getOutcome()
   {
      try
      {
         return adaptedClass.getOutcome();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Outcome", e);
      }
   }

   public Iqicoreprocedure setOutcome(CodeableConcept param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public boolean hasOutcome()
   {
      return adaptedClass.hasOutcome();
   }

   public List<Procedure.ProcedureFocalDeviceComponent> getFocalDevice()
   {
      try
      {
         return adaptedClass.getFocalDevice();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting FocalDevice", e);
      }
   }

   public qicoreprocedureAdapter setFocalDevice(
         List<Procedure.ProcedureFocalDeviceComponent> param)
   {
      adaptedClass.setFocalDevice(param);
      return this;
   }

   public boolean hasFocalDevice()
   {
      return adaptedClass.hasFocalDevice();
   }

   public qicoreprocedureAdapter addFocalDevice(
         Procedure.ProcedureFocalDeviceComponent param)
   {
      adaptedClass.addFocalDevice(param);
      return this;
   }

   public Procedure.ProcedureFocalDeviceComponent addFocalDevice()
   {
      return adaptedClass.addFocalDevice();
   }

   public boolean hasReport()
   {
      return adaptedClass.hasReport();
   }

   public List<Reference> getReport()
   {
      return adaptedClass.getReport();
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

   public Iqicoreprocedure setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreprocedure addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public Reference getRequest()
   {
      try
      {
         return adaptedClass.getRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Request", e);
      }
   }

   public Resource getRequestTarget()
   {
      try
      {
         return adaptedClass.getRequestTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting RequestTarget", e);
      }
   }

   public boolean hasRequest()
   {
      return adaptedClass.hasRequest();
   }

   public Reference getRequestCarePlan()
   {
      try
      {
         return adaptedClass.getRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Request", e);
      }
   }

   public Iqicoreprocedure setRequest(Reference param)
   {
      adaptedClass.setRequest(param);
      return this;
   }

   public CarePlan getRequestCarePlanTarget()
   {
      return (org.hl7.fhir.dstu3.model.CarePlan) adaptedClass
            .getRequestTarget();
   }

   public Iqicoreprocedure setRequestTarget(CarePlan param)
   {
      adaptedClass.setRequestTarget(param);
      return this;
   }

   public Reference getRequestDiagnosticRequest()
   {
      try
      {
         return adaptedClass.getRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Request", e);
      }
   }

   public DiagnosticRequest getRequestDiagnosticRequestTarget()
   {
      return (org.hl7.fhir.dstu3.model.DiagnosticRequest) adaptedClass
            .getRequestTarget();
   }

   public Iqicoreprocedure setRequestTarget(DiagnosticRequest param)
   {
      adaptedClass.setRequestTarget(param);
      return this;
   }

   public Reference getRequestProcedureRequest()
   {
      try
      {
         return adaptedClass.getRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Request", e);
      }
   }

   public ProcedureRequest getRequestProcedureRequestTarget()
   {
      return (org.hl7.fhir.dstu3.model.ProcedureRequest) adaptedClass
            .getRequestTarget();
   }

   public Iqicoreprocedure setRequestTarget(ProcedureRequest param)
   {
      adaptedClass.setRequestTarget(param);
      return this;
   }

   public Reference getRequestReferralRequest()
   {
      try
      {
         return adaptedClass.getRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Request", e);
      }
   }

   public ReferralRequest getRequestReferralRequestTarget()
   {
      return (org.hl7.fhir.dstu3.model.ReferralRequest) adaptedClass
            .getRequestTarget();
   }

   public Iqicoreprocedure setRequestTarget(ReferralRequest param)
   {
      adaptedClass.setRequestTarget(param);
      return this;
   }

   public CodeableConcept getCategory()
   {
      try
      {
         return adaptedClass.getCategory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Category", e);
      }
   }

   public Iqicoreprocedure setCategory(CodeableConcept param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Type getPerformed()
   {
      try
      {
         return adaptedClass.getPerformed();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performed", e);
      }
   }

   public Iqicoreprocedure setPerformed(Type param)
   {
      adaptedClass.setPerformed(param);
      return this;
   }

   public DateTimeType getPerformedDateTimeType()
   {
      try
      {
         return adaptedClass.getPerformedDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformedDateTimeType", e);
      }
   }

   public boolean hasPerformedDateTimeType()
   {
      return adaptedClass.hasPerformedDateTimeType();
   }

   public Period getPerformedPeriod()
   {
      try
      {
         return adaptedClass.getPerformedPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformedPeriod", e);
      }
   }

   public boolean hasPerformedPeriod()
   {
      return adaptedClass.hasPerformedPeriod();
   }

   public boolean hasComponent()
   {
      return adaptedClass.hasComponent();
   }

   public List<MedicationAdministration> getComponentMedicationAdministrationTarget() {
		List<org.hl7.fhir.dstu3.model.MedicationAdministration> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getComponentTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.MedicationAdministration) resource);
		}
		return items;
	}

   public List<Reference> getComponent()
   {
      return adaptedClass.getComponent();
   }

   public List<Procedure> getComponentProcedureTarget() {
		List<org.hl7.fhir.dstu3.model.Procedure> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getComponentTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Procedure) resource);
		}
		return items;
	}

   public List<Observation> getComponentObservationTarget() {
		List<org.hl7.fhir.dstu3.model.Observation> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getComponentTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Observation) resource);
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

   public Iqicoreprocedure setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreprocedure setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<Procedure.ProcedurePerformerComponent> getPerformer()
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

   public qicoreprocedureAdapter setPerformer(
         List<Procedure.ProcedurePerformerComponent> param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public qicoreprocedureAdapter addPerformer(
         Procedure.ProcedurePerformerComponent param)
   {
      adaptedClass.addPerformer(param);
      return this;
   }

   public Procedure.ProcedurePerformerComponent addPerformer()
   {
      return adaptedClass.addPerformer();
   }

   public List<Annotation> getNotes()
   {
      try
      {
         return adaptedClass.getNotes();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Notes", e);
      }
   }

   public Iqicoreprocedure setNotes(List<Annotation> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public boolean hasNotes()
   {
      return adaptedClass.hasNotes();
   }

   public Iqicoreprocedure addNotes(Annotation param)
   {
      adaptedClass.addNotes(param);
      return this;
   }

   public Annotation addNotes()
   {
      return adaptedClass.addNotes();
   }

   public List<CodeableConcept> getReasonCode()
   {
      try
      {
         return adaptedClass.getReasonCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonCode", e);
      }
   }

   public Iqicoreprocedure setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public Iqicoreprocedure addReasonCode(CodeableConcept param)
   {
      adaptedClass.addReasonCode(param);
      return this;
   }

   public CodeableConcept addReasonCode()
   {
      return adaptedClass.addReasonCode();
   }

   public List<CodeableConcept> getBodySite()
   {
      try
      {
         return adaptedClass.getBodySite();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BodySite", e);
      }
   }

   public Iqicoreprocedure setBodySite(List<CodeableConcept> param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public boolean hasBodySite()
   {
      return adaptedClass.hasBodySite();
   }

   public Iqicoreprocedure addBodySite(CodeableConcept param)
   {
      adaptedClass.addBodySite(param);
      return this;
   }

   public CodeableConcept addBodySite()
   {
      return adaptedClass.addBodySite();
   }

   public boolean hasUsedReference()
   {
      return adaptedClass.hasUsedReference();
   }

   public List<Device> getUsedReferenceDeviceTarget() {
		List<org.hl7.fhir.dstu3.model.Device> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getUsedReferenceTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Device) resource);
		}
		return items;
	}

   public List<Reference> getUsedReference()
   {
      return adaptedClass.getUsedReference();
   }

   public List<Medication> getUsedReferenceMedicationTarget() {
		List<org.hl7.fhir.dstu3.model.Medication> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getUsedReferenceTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Medication) resource);
		}
		return items;
	}

   public List<Substance> getUsedReferenceSubstanceTarget() {
		List<org.hl7.fhir.dstu3.model.Substance> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getUsedReferenceTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Substance) resource);
		}
		return items;
	}

   public Reference getSubject()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Resource getSubjectTarget()
   {
      try
      {
         return adaptedClass.getSubjectTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SubjectTarget", e);
      }
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getSubjectPatient()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Iqicoreprocedure setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoreprocedure setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectPatientAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
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

   public Iqicoreprocedure setSubjectAdapterTarget(qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectGroup()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Group getSubjectGroupTarget()
   {
      return (org.hl7.fhir.dstu3.model.Group) adaptedClass.getSubjectTarget();
   }

   public Iqicoreprocedure setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
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

   public Iqicoreprocedure setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreprocedure setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasNotPerformed()
   {
      return adaptedClass.hasNotPerformed();
   }

   public boolean hasNotPerformedElement()
   {
      return adaptedClass.hasNotPerformedElement();
   }

   public BooleanType getNotPerformedElement()
   {
      try
      {
         return adaptedClass.getNotPerformedElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting NotPerformedElement", e);
      }
   }

   public Boolean getNotPerformed()
   {
      try
      {
         return adaptedClass.getNotPerformed();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting NotPerformed", e);
      }
   }

   public Iqicoreprocedure setNotPerformedElement(BooleanType param)
   {
      adaptedClass.setNotPerformedElement(param);
      return this;
   }

   public Iqicoreprocedure setNotPerformed(Boolean param)
   {
      adaptedClass.setNotPerformed(param);
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

   public Procedure.ProcedureStatus getStatus()
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

   public Enumeration<Procedure.ProcedureStatus> getStatusElement()
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

   public Iqicoreprocedure setStatus(Procedure.ProcedureStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreprocedure setStatusElement(
         Enumeration<Procedure.ProcedureStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public List<CodeableConcept> getReasonNotPerformed()
   {
      try
      {
         return adaptedClass.getReasonNotPerformed();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonNotPerformed", e);
      }
   }

   public Iqicoreprocedure setReasonNotPerformed(List<CodeableConcept> param)
   {
      adaptedClass.setReasonNotPerformed(param);
      return this;
   }

   public boolean hasReasonNotPerformed()
   {
      return adaptedClass.hasReasonNotPerformed();
   }

   public Iqicoreprocedure addReasonNotPerformed(CodeableConcept param)
   {
      adaptedClass.addReasonNotPerformed(param);
      return this;
   }

   public CodeableConcept addReasonNotPerformed()
   {
      return adaptedClass.addReasonNotPerformed();
   }

   public List<CodeableConcept> getFollowUp()
   {
      try
      {
         return adaptedClass.getFollowUp();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting FollowUp", e);
      }
   }

   public Iqicoreprocedure setFollowUp(List<CodeableConcept> param)
   {
      adaptedClass.setFollowUp(param);
      return this;
   }

   public boolean hasFollowUp()
   {
      return adaptedClass.hasFollowUp();
   }

   public Iqicoreprocedure addFollowUp(CodeableConcept param)
   {
      adaptedClass.addFollowUp(param);
      return this;
   }

   public CodeableConcept addFollowUp()
   {
      return adaptedClass.addFollowUp();
   }

   public CodeableConcept getCode()
   {
      try
      {
         return adaptedClass.getCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Code", e);
      }
   }

   public Iqicoreprocedure setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public List<BodySite> getApproachBodySite() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedure-approachBodySite");
		List<org.hl7.fhir.dstu3.model.BodySite> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.hl7.fhir.dstu3.model.Reference reference = (org.hl7.fhir.dstu3.model.Reference) extension
					.getValue();
			returnList.add((org.hl7.fhir.dstu3.model.BodySite) reference
					.getResource());
		}
		return returnList;
	}

   public Iqicoreprocedure setApproachBodySite(List<BodySite> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference(
                  param.get(index));
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/StructureDefinition/procedure-approachBodySite")
                  .setValue(reference);
         }
      }
      return this;
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

   public Iqicoreprocedure setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicoreprocedure setEncounterTarget(Encounter param)
   {
      adaptedClass.setEncounterTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getEncounter().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter();
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

   public Iqicoreprocedure setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
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

   public Iqicoreprocedure setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreprocedure addContained(Resource param)
   {
      adaptedClass.addContained(param);
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

   public Iqicoreprocedure setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreprocedure setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<CodeableConcept> getComplication()
   {
      try
      {
         return adaptedClass.getComplication();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Complication", e);
      }
   }

   public Iqicoreprocedure setComplication(List<CodeableConcept> param)
   {
      adaptedClass.setComplication(param);
      return this;
   }

   public boolean hasComplication()
   {
      return adaptedClass.hasComplication();
   }

   public Iqicoreprocedure addComplication(CodeableConcept param)
   {
      adaptedClass.addComplication(param);
      return this;
   }

   public CodeableConcept addComplication()
   {
      return adaptedClass.addComplication();
   }

   public boolean hasReasonReference()
   {
      return adaptedClass.hasReasonReference();
   }

   public List<Reference> getReasonReference()
   {
      return adaptedClass.getReasonReference();
   }

   public List<CodeableConcept> getUsedCode()
   {
      try
      {
         return adaptedClass.getUsedCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting UsedCode", e);
      }
   }

   public Iqicoreprocedure setUsedCode(List<CodeableConcept> param)
   {
      adaptedClass.setUsedCode(param);
      return this;
   }

   public boolean hasUsedCode()
   {
      return adaptedClass.hasUsedCode();
   }

   public Iqicoreprocedure addUsedCode(CodeableConcept param)
   {
      adaptedClass.addUsedCode(param);
      return this;
   }

   public CodeableConcept addUsedCode()
   {
      return adaptedClass.addUsedCode();
   }
}