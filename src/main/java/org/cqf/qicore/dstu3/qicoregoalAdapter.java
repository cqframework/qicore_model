package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Goal;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
import java.util.List;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Duration;
import org.hl7.fhir.dstu3.model.UriType;
import java.util.Date;

import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.*;

public class qicoregoalAdapter implements Iqicoregoal
{

   private Goal adaptedClass;

   public qicoregoalAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Goal();
   }

   public qicoregoalAdapter(Goal adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Goal getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Goal param)
   {
      this.adaptedClass = param;
   }

   public Reference getExpressedBy()
   {
      try
      {
         return adaptedClass.getExpressedBy();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpressedBy", e);
      }
   }

   public Resource getExpressedByTarget()
   {
      try
      {
         return adaptedClass.getExpressedByTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpressedByTarget", e);
      }
   }

   public boolean hasExpressedBy()
   {
      return adaptedClass.hasExpressedBy();
   }

   public Reference getExpressedByPatient()
   {
      try
      {
         return adaptedClass.getExpressedBy();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpressedBy", e);
      }
   }

   public Iqicoregoal setExpressedBy(Reference param)
   {
      adaptedClass.setExpressedBy(param);
      return this;
   }

   public Patient getExpressedByPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getExpressedByTarget();
   }

   public Iqicoregoal setExpressedByTarget(Patient param)
   {
      adaptedClass.setExpressedByTarget(param);
      return this;
   }

   public Reference getExpressedByPractitioner()
   {
      try
      {
         return adaptedClass.getExpressedBy();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpressedBy", e);
      }
   }

   public Practitioner getExpressedByPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getExpressedByTarget();
   }

   public Iqicoregoal setExpressedByTarget(Practitioner param)
   {
      adaptedClass.setExpressedByTarget(param);
      return this;
   }

   public Reference getExpressedByRelatedPerson()
   {
      try
      {
         return adaptedClass.getExpressedBy();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpressedBy", e);
      }
   }

   public RelatedPerson getExpressedByRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getExpressedByTarget();
   }

   public Iqicoregoal setExpressedByTarget(RelatedPerson param)
   {
      adaptedClass.setExpressedByTarget(param);
      return this;
   }

   public CodeableConcept getDescription()
   {
      try
      {
         return adaptedClass.getDescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Description", e);
      }
   }

   public Iqicoregoal setDescription(CodeableConcept param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
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

   public Iqicoregoal setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoregoal addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public List<Goal.GoalOutcomeComponent> getOutcome()
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

   public qicoregoalAdapter setOutcome(List<Goal.GoalOutcomeComponent> param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public boolean hasOutcome()
   {
      return adaptedClass.hasOutcome();
   }

   public qicoregoalAdapter addOutcome(Goal.GoalOutcomeComponent param)
   {
      adaptedClass.addOutcome(param);
      return this;
   }

   public Goal.GoalOutcomeComponent addOutcome()
   {
      return adaptedClass.addOutcome();
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

   public Iqicoregoal setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoregoal addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public List<qicoregoalTargetAdapter> getTargetValue() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target");
		List<qicoregoalTargetAdapter> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			qicoregoalTargetAdapter udt = new qicoregoalTargetAdapter();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public Iqicoregoal setTargetValue(List<qicoregoalTargetAdapter> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<qicoregoalTargetAdapter>) param)
               .size(); index++)
         {
            adaptedClass.addExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public CodeableConcept getReasonRejected()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-reasonRejected");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRejected");
      }
   }

   public Iqicoregoal setReasonRejected(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/goal-reasonRejected")
            .setValue(param);
      return this;
   }

   public Type getStart()
   {
      try
      {
         return adaptedClass.getStart();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Start", e);
      }
   }

   public Iqicoregoal setStart(Type param)
   {
      adaptedClass.setStart(param);
      return this;
   }

   public DateType getStartDateType()
   {
      try
      {
         return adaptedClass.getStartDateType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StartDateType", e);
      }
   }

   public boolean hasStartDateType()
   {
      return adaptedClass.hasStartDateType();
   }

   public CodeableConcept getStartCodeableConcept()
   {
      try
      {
         return adaptedClass.getStartCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StartCodeableConcept", e);
      }
   }

   public boolean hasStartCodeableConcept()
   {
      return adaptedClass.hasStartCodeableConcept();
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public Goal.GoalStatus getStatus()
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

   public Enumeration<Goal.GoalStatus> getStatusElement()
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

   public Iqicoregoal setStatus(Goal.GoalStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoregoal setStatusElement(Enumeration<Goal.GoalStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public CodeableConcept getPriority()
   {
      try
      {
         return adaptedClass.getPriority();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Priority", e);
      }
   }

   public Iqicoregoal setPriority(CodeableConcept param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
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

   public Iqicoregoal setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoregoal setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
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

   public Iqicoregoal setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoregoal setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Type getTarget()
   {
      try
      {
         return adaptedClass.getTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Target", e);
      }
   }

   public Iqicoregoal setTarget(Type param)
   {
      adaptedClass.setTarget(param);
      return this;
   }

   public DateType getTargetDateType()
   {
      try
      {
         return adaptedClass.getTargetDateType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TargetDateType", e);
      }
   }

   public boolean hasTargetDateType()
   {
      return adaptedClass.hasTargetDateType();
   }

   public Duration getTargetDuration()
   {
      try
      {
         return adaptedClass.getTargetDuration();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TargetDuration", e);
      }
   }

   public boolean hasTargetDuration()
   {
      return adaptedClass.hasTargetDuration();
   }

   public List<CodeableConcept> getStatusReason()
   {
      try
      {
         return adaptedClass.getStatusReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusReason", e);
      }
   }

   public Iqicoregoal setStatusReason(List<CodeableConcept> param)
   {
      adaptedClass.setStatusReason(param);
      return this;
   }

   public boolean hasStatusReason()
   {
      return adaptedClass.hasStatusReason();
   }

   public Iqicoregoal addStatusReason(CodeableConcept param)
   {
      adaptedClass.addStatusReason(param);
      return this;
   }

   public CodeableConcept addStatusReason()
   {
      return adaptedClass.addStatusReason();
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

   public Iqicoregoal setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoregoal setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasStatusDate()
   {
      return adaptedClass.hasStatusDate();
   }

   public boolean hasStatusDateElement()
   {
      return adaptedClass.hasStatusDateElement();
   }

   public DateType getStatusDateElement()
   {
      try
      {
         return adaptedClass.getStatusDateElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusDateElement", e);
      }
   }

   public Date getStatusDate()
   {
      try
      {
         return adaptedClass.getStatusDate();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusDate", e);
      }
   }

   public Iqicoregoal setStatusDateElement(DateType param)
   {
      adaptedClass.setStatusDateElement(param);
      return this;
   }

   public Iqicoregoal setStatusDate(Date param)
   {
      adaptedClass.setStatusDate(param);
      return this;
   }

   public boolean hasAddresses()
   {
      return adaptedClass.hasAddresses();
   }

   public List<Condition> getAddressesConditionTarget() {
		List<org.hl7.fhir.dstu3.model.Condition> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Condition) resource);
		}
		return items;
	}

   public List<Reference> getAddresses()
   {
      return adaptedClass.getAddresses();
   }

   public List<Observation> getAddressesObservationTarget() {
		List<org.hl7.fhir.dstu3.model.Observation> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Observation) resource);
		}
		return items;
	}

   public List<MedicationStatement> getAddressesMedicationStatementTarget() {
		List<org.hl7.fhir.dstu3.model.MedicationStatement> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.MedicationStatement) resource);
		}
		return items;
	}

   public List<NutritionRequest> getAddressesNutritionRequestTarget() {
		List<org.hl7.fhir.dstu3.model.NutritionRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.NutritionRequest) resource);
		}
		return items;
	}

   public List<ProcedureRequest> getAddressesProcedureRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ProcedureRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ProcedureRequest) resource);
		}
		return items;
	}

   public List<RiskAssessment> getAddressesRiskAssessmentTarget() {
		List<org.hl7.fhir.dstu3.model.RiskAssessment> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getAddressesTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.RiskAssessment) resource);
		}
		return items;
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

   public Iqicoregoal setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoregoal addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
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

   public Iqicoregoal setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoregoal setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectPatientAdapterTarget()
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

   public Iqicoregoal setSubjectAdapterTarget(qicorepatientAdapter param)
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

   public Iqicoregoal setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public Reference getSubjectOrganization()
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

   public Organization getSubjectOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoregoal setSubjectTarget(Organization param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getSubjectOrganizationAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoregoal setSubjectAdapterTarget(qicoreorganizationAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public List<CodeableConcept> getCategory()
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

   public Iqicoregoal setCategory(List<CodeableConcept> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Iqicoregoal addCategory(CodeableConcept param)
   {
      adaptedClass.addCategory(param);
      return this;
   }

   public CodeableConcept addCategory()
   {
      return adaptedClass.addCategory();
   }
}