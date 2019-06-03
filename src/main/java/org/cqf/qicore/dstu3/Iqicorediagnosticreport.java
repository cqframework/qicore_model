package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.DiagnosticReport;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.InstantType;

import java.util.Date;

import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.IdType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Attachment;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;

public interface Iqicorediagnosticreport
{

   public DiagnosticReport getAdaptee();

   public void setAdaptee(DiagnosticReport param);

   public List<Identifier> getIdentifier();

   public Iqicorediagnosticreport setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorediagnosticreport addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasIssued();

   public boolean hasIssuedElement();

   public InstantType getIssuedElement();

   public Date getIssued();

   public Iqicorediagnosticreport setIssuedElement(InstantType param);

   public Iqicorediagnosticreport setIssued(Date param);

   public Location getLocationPerformed();

   public Iqicorediagnosticreport setLocationPerformed(Location param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorediagnosticreport setIdElement(IdType param);

   public Iqicorediagnosticreport setId(String param);

   public List<DiagnosticReport.DiagnosticReportImageComponent> getImage();

   public qicorediagnosticreportAdapter setImage(
         List<DiagnosticReport.DiagnosticReportImageComponent> param);

   public boolean hasImage();

   public qicorediagnosticreportAdapter addImage(
         DiagnosticReport.DiagnosticReportImageComponent param);

   public DiagnosticReport.DiagnosticReportImageComponent addImage();

   public List<Attachment> getPresentedForm();

   public Iqicorediagnosticreport setPresentedForm(List<Attachment> param);

   public boolean hasPresentedForm();

   public Iqicorediagnosticreport addPresentedForm(Attachment param);

   public Attachment addPresentedForm();

   public CodeableConcept getCode();

   public Iqicorediagnosticreport setCode(CodeableConcept param);

   public boolean hasCode();

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicorediagnosticreport setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicorediagnosticreport setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicorediagnosticreport setSubjectTarget(Group param);

   public Reference getSubjectDevice();

   public Device getSubjectDeviceTarget();

   public Iqicorediagnosticreport setSubjectTarget(Device param);

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget();

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicoredeviceAdapter param);

   public Reference getSubjectLocation();

   public Location getSubjectLocationTarget();

   public Iqicorediagnosticreport setSubjectTarget(Location param);

   public qicorelocationAdapter getSubjectLocationAdapterTarget();

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicorelocationAdapter param);

   public CodeableConcept getCategory();

   public Iqicorediagnosticreport setCategory(CodeableConcept param);

   public boolean hasCategory();

   public boolean hasSpecimen();

   public List<Reference> getSpecimen();

   public boolean hasStatus();

   public boolean hasStatusElement();

   public DiagnosticReport.DiagnosticReportStatus getStatus();

   public Enumeration<DiagnosticReport.DiagnosticReportStatus> getStatusElement();

   public Iqicorediagnosticreport setStatus(
         DiagnosticReport.DiagnosticReportStatus param);

   public Iqicorediagnosticreport setStatusElement(
         Enumeration<DiagnosticReport.DiagnosticReportStatus> param);

   public List<Resource> getContained();

   public Iqicorediagnosticreport setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorediagnosticreport addContained(Resource param);

   public boolean hasConclusion();

   public boolean hasConclusionElement();

   public StringType getConclusionElement();

   public String getConclusion();

   public Iqicorediagnosticreport setConclusionElement(StringType param);

   public Iqicorediagnosticreport setConclusion(String param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorediagnosticreport setLanguageElement(CodeType param);

   public Iqicorediagnosticreport setLanguage(String param);

   public boolean hasImagingStudy();

   public List<ImagingStudy> getImagingStudyImagingStudyTarget();

   public List<Reference> getImagingStudy();

   public List<ImagingManifest> getImagingStudyImagingManifestTarget();

   public boolean hasPerformer();

   public List<DiagnosticReport.DiagnosticReportPerformerComponent> getPerformer();

   public Resource getContextTarget();

   public boolean hasResult();

   public List<Reference> getResult();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorediagnosticreport setImplicitRulesElement(UriType param);

   public Iqicorediagnosticreport setImplicitRules(String param);

   public boolean hasBasedOn();

   public List<CarePlan> getBasedOnCarePlanTarget();

   public List<Reference> getBasedOn();

   public List<ImmunizationRecommendation> getBasedOnImmunizationRecommendationTarget();

   public List<MedicationRequest> getBasedOnMedicationRequestTarget();

   public List<NutritionOrder> getBasedOnNutritionOrderTarget();

   public List<ProcedureRequest> getBasedOnProcedureRequestTarget();

   public List<ReferralRequest> getBasedOnReferralRequestTarget();

   public Type getEffective();

   public Iqicorediagnosticreport setEffective(Type param);

   public DateTimeType getEffectiveDateTimeType();

   public boolean hasEffectiveDateTimeType();

   public Period getEffectivePeriod();

   public boolean hasEffectivePeriod();

   public List<CodeableConcept> getCodedDiagnosis();

   public Iqicorediagnosticreport setCodedDiagnosis(List<CodeableConcept> param);

   public boolean hasCodedDiagnosis();

   public Iqicorediagnosticreport addCodedDiagnosis(CodeableConcept param);

   public CodeableConcept addCodedDiagnosis();
}
