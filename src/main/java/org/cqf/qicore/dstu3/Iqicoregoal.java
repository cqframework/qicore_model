package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Goal;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
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

public interface Iqicoregoal
{

   public Goal getAdaptee();

   public void setAdaptee(Goal param);

   public Reference getExpressedBy();

   public Resource getExpressedByTarget();

   public boolean hasExpressedBy();

   public Reference getExpressedByPatient();

   public Iqicoregoal setExpressedBy(Reference param);

   public Patient getExpressedByPatientTarget();

   public Iqicoregoal setExpressedByTarget(Patient param);

   public Reference getExpressedByPractitioner();

   public Practitioner getExpressedByPractitionerTarget();

   public Iqicoregoal setExpressedByTarget(Practitioner param);

   public Reference getExpressedByRelatedPerson();

   public RelatedPerson getExpressedByRelatedPersonTarget();

   public Iqicoregoal setExpressedByTarget(RelatedPerson param);

   public CodeableConcept getDescription();

   public Iqicoregoal setDescription(CodeableConcept param);

   public boolean hasDescription();

   public List<Annotation> getNote();

   public Iqicoregoal setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoregoal addNote(Annotation param);

   public Annotation addNote();

   public List<CodeableConcept> getOutcomeCode();

   public boolean hasOutcomeCode();

   public qicoregoalAdapter setOutcomeCode(List<CodeableConcept> param);

   public qicoregoalAdapter addOutcomeCode(CodeableConcept param);

   public List<Identifier> getIdentifier();

   public Iqicoregoal setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoregoal addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<qicoregoalTargetAdapter> getTargetValue();

   public Iqicoregoal setTargetValue(List<qicoregoalTargetAdapter> param);

   public CodeableConcept getReasonRejected();

   public Iqicoregoal setReasonRejected(CodeableConcept param);

   public Type getStart();

   public Iqicoregoal setStart(Type param);

   public DateType getStartDateType();

   public boolean hasStartDateType();

   public CodeableConcept getStartCodeableConcept();

   public boolean hasStartCodeableConcept();

   public boolean hasStatus();

   public boolean hasStatusElement();

   public Goal.GoalStatus getStatus();

   public Enumeration<Goal.GoalStatus> getStatusElement();

   public Iqicoregoal setStatus(Goal.GoalStatus param);

   public Iqicoregoal setStatusElement(Enumeration<Goal.GoalStatus> param);

   public CodeableConcept getPriority();

   public Iqicoregoal setPriority(CodeableConcept param);

   public boolean hasPriority();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoregoal setLanguageElement(CodeType param);

   public Iqicoregoal setLanguage(String param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoregoal setIdElement(IdType param);

   public Iqicoregoal setId(String param);

   public Goal.GoalTargetComponent getTarget();

   public Iqicoregoal setTarget(Goal.GoalTargetComponent param);

   public StringType getStatusReasonElement();

   public Iqicoregoal setStatusReasonElement(StringType param);

   public boolean hasStatusReasonElement();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoregoal setImplicitRulesElement(UriType param);

   public Iqicoregoal setImplicitRules(String param);

   public boolean hasStatusDate();

   public boolean hasStatusDateElement();

   public DateType getStatusDateElement();

   public Date getStatusDate();

   public Iqicoregoal setStatusDateElement(DateType param);

   public Iqicoregoal setStatusDate(Date param);

   public boolean hasAddresses();

   public List<Condition> getAddressesConditionTarget();

   public List<Reference> getAddresses();

   public List<Observation> getAddressesObservationTarget();

   public List<MedicationStatement> getAddressesMedicationStatementTarget();

   public List<NutritionOrder> getAddressesNutritionOrderTarget();

   public List<ProcedureRequest> getAddressesProcedureRequestTarget();

   public List<RiskAssessment> getAddressesRiskAssessmentTarget();

   public List<Resource> getContained();

   public Iqicoregoal setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoregoal addContained(Resource param);

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicoregoal setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicoregoal setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicoregoal setSubjectAdapterTarget(qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicoregoal setSubjectTarget(Group param);

   public Reference getSubjectOrganization();

   public Organization getSubjectOrganizationTarget();

   public Iqicoregoal setSubjectTarget(Organization param);

   public qicoreorganizationAdapter getSubjectOrganizationAdapterTarget();

   public Iqicoregoal setSubjectAdapterTarget(qicoreorganizationAdapter param);

   public List<CodeableConcept> getCategory();

   public Iqicoregoal setCategory(List<CodeableConcept> param);

   public boolean hasCategory();

   public Iqicoregoal addCategory(CodeableConcept param);

   public CodeableConcept addCategory();
}
