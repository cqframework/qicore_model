package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Procedure;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CarePlan;
import org.hl7.fhir.dstu3.model.ProcedureRequest;
import org.hl7.fhir.dstu3.model.ReferralRequest;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
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

public interface Iqicoreprocedure
{

   public Procedure getAdaptee();

   public void setAdaptee(Procedure param);

   public boolean hasLocation();

   public Reference getLocation();

   public Iqicoreprocedure setLocation(Reference param);

   public Location getLocationTarget();

   public Iqicoreprocedure setLocationTarget(Location param);

   public qicorelocationAdapter getLocationAdapterTarget();

   public Iqicoreprocedure setLocationAdapterTarget(qicorelocationAdapter param);

   public CodeableConcept getOutcome();

   public Iqicoreprocedure setOutcome(CodeableConcept param);

   public boolean hasOutcome();

   public List<Procedure.ProcedureFocalDeviceComponent> getFocalDevice();

   public qicoreprocedureAdapter setFocalDevice(
         List<Procedure.ProcedureFocalDeviceComponent> param);

   public boolean hasFocalDevice();

   public qicoreprocedureAdapter addFocalDevice(
         Procedure.ProcedureFocalDeviceComponent param);

   public Procedure.ProcedureFocalDeviceComponent addFocalDevice();

   public boolean hasReport();

   public List<Reference> getReport();

   public List<Identifier> getIdentifier();

   public Iqicoreprocedure setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreprocedure addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasBasedOn();

   public List<Reference> getBasedOn();

   public Iqicoreprocedure setBasedOn(List<Reference> param);

   public List<Reference> getBasedOnCarePlan();

   public List<CarePlan> getBasedOnCarePlanTarget();

   public List<Reference> getBasedOnProcedureRequest();

   public List<ProcedureRequest> getBasedOnProcedureRequestTarget();

   public List<Reference> getBasedOnReferralRequest();

   public List<ReferralRequest> getBasedOnReferralRequestTarget();

   public CodeableConcept getCategory();

   public Iqicoreprocedure setCategory(CodeableConcept param);

   public boolean hasCategory();

   public Type getPerformed();

   public Iqicoreprocedure setPerformed(Type param);

   public DateTimeType getPerformedDateTimeType();

   public boolean hasPerformedDateTimeType();

   public Period getPerformedPeriod();

   public boolean hasPerformedPeriod();

   public List<MedicationAdministration> getPartOfMedicationAdministrationTarget();

   public List<Reference> getPartOf();

   public List<Procedure> getPartOfProcedureTarget();

   public List<Observation> getPartOfObservationTarget();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreprocedure setImplicitRulesElement(UriType param);

   public Iqicoreprocedure setImplicitRules(String param);

   public List<Procedure.ProcedurePerformerComponent> getPerformer();

   public qicoreprocedureAdapter setPerformer(
         List<Procedure.ProcedurePerformerComponent> param);

   public boolean hasPerformer();

   public qicoreprocedureAdapter addPerformer(
         Procedure.ProcedurePerformerComponent param);

   public Procedure.ProcedurePerformerComponent addPerformer();

   public List<Annotation> getNotes();

   public Iqicoreprocedure setNotes(List<Annotation> param);

   public boolean hasNotes();

   public Iqicoreprocedure addNotes(Annotation param);

   public Annotation addNotes();

   public List<CodeableConcept> getReasonCode();

   public Iqicoreprocedure setReasonCode(List<CodeableConcept> param);

   public boolean hasReasonCode();

   public Iqicoreprocedure addReasonCode(CodeableConcept param);

   public CodeableConcept addReasonCode();

   public List<CodeableConcept> getBodySite();

   public Iqicoreprocedure setBodySite(List<CodeableConcept> param);

   public boolean hasBodySite();

   public Iqicoreprocedure addBodySite(CodeableConcept param);

   public CodeableConcept addBodySite();

   public boolean hasUsedReference();

   public List<Device> getUsedReferenceDeviceTarget();

   public List<Reference> getUsedReference();

   public List<Medication> getUsedReferenceMedicationTarget();

   public List<Substance> getUsedReferenceSubstanceTarget();

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicoreprocedure setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicoreprocedure setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicoreprocedure setSubjectAdapterTarget(qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicoreprocedure setSubjectTarget(Group param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreprocedure setIdElement(IdType param);

   public Iqicoreprocedure setId(String param);

   public boolean hasNotDone();

   public boolean hasNotDoneElement();

   public BooleanType getNotDoneElement();

   public Boolean getNotDone();

   public Iqicoreprocedure setNotDoneElement(BooleanType param);

   public Iqicoreprocedure setNotDone(Boolean param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public Procedure.ProcedureStatus getStatus();

   public Enumeration<Procedure.ProcedureStatus> getStatusElement();

   public Iqicoreprocedure setStatus(Procedure.ProcedureStatus param);

   public Iqicoreprocedure setStatusElement(
         Enumeration<Procedure.ProcedureStatus> param);

   public CodeableConcept getNotDoneReason();

   public Iqicoreprocedure setNotDoneReason(CodeableConcept param);

   public boolean hasNotDoneReason();

   public List<CodeableConcept> getFollowUp();

   public Iqicoreprocedure setFollowUp(List<CodeableConcept> param);

   public boolean hasFollowUp();

   public Iqicoreprocedure addFollowUp(CodeableConcept param);

   public CodeableConcept addFollowUp();

   public CodeableConcept getCode();

   public Iqicoreprocedure setCode(CodeableConcept param);

   public boolean hasCode();

   public List<BodySite> getApproachBodySite();

   public Iqicoreprocedure setApproachBodySite(List<BodySite> param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicoreprocedure setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicoreprocedure setContextTarget(Encounter param);

   public qicoreencounterAdapter getEncounterAdapterTarget();

   public Iqicoreprocedure setEncounterAdapterTarget(
         qicoreencounterAdapter param);

   public List<Resource> getContained();

   public Iqicoreprocedure setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreprocedure addContained(Resource param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreprocedure setLanguageElement(CodeType param);

   public Iqicoreprocedure setLanguage(String param);

   public List<CodeableConcept> getComplication();

   public Iqicoreprocedure setComplication(List<CodeableConcept> param);

   public boolean hasComplication();

   public Iqicoreprocedure addComplication(CodeableConcept param);

   public CodeableConcept addComplication();

   public boolean hasReasonReference();

   public List<Reference> getReasonReference();

   public List<CodeableConcept> getUsedCode();

   public Iqicoreprocedure setUsedCode(List<CodeableConcept> param);

   public boolean hasUsedCode();

   public Iqicoreprocedure addUsedCode(CodeableConcept param);

   public CodeableConcept addUsedCode();
}
