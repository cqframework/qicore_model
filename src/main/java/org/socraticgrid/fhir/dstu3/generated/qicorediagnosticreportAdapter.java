package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicorediagnosticreport;
import org.hl7.fhir.dstu3.model.DiagnosticReport;
import org.hl7.fhir.dstu3.model.Identifier;
import java.util.List;
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
import org.socraticgrid.fhir.dstu3.generated.qicoreimagingstudyAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter;
import org.hl7.fhir.dstu3.model.UriType;
import org.socraticgrid.fhir.dstu3.generated.qicorediagnosticrequestAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicoreprocedurerequestAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorereferralrequestAdapter;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorediagnosticreportAdapter implements Iqicorediagnosticreport
{

   private DiagnosticReport adaptedClass;

   public qicorediagnosticreportAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.DiagnosticReport();
   }

   public qicorediagnosticreportAdapter(DiagnosticReport adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticReport getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticReport param)
   {
      this.adaptedClass = param;
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

   public Iqicorediagnosticreport setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorediagnosticreport addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasIssued()
   {
      return adaptedClass.hasIssued();
   }

   public boolean hasIssuedElement()
   {
      return adaptedClass.hasIssuedElement();
   }

   public InstantType getIssuedElement()
   {
      try
      {
         return adaptedClass.getIssuedElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IssuedElement", e);
      }
   }

   public Date getIssued()
   {
      try
      {
         return adaptedClass.getIssued();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Issued", e);
      }
   }

   public Iqicorediagnosticreport setIssuedElement(InstantType param)
   {
      adaptedClass.setIssuedElement(param);
      return this;
   }

   public Iqicorediagnosticreport setIssued(Date param)
   {
      adaptedClass.setIssued(param);
      return this;
   }

   public Location getLocationPerformed()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/diagnosticReport-locationPerformed");
      org.hl7.fhir.dstu3.model.Location returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Location) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + "http://hl7.org/fhir/StructureDefinition/diagnosticReport-locationPerformed");
      }
      return returnItem;
   }

   public Iqicorediagnosticreport setLocationPerformed(Location param)
   {
      if (param != null)
      {
         adaptedClass
               .addExtension()
               .setUrl("http://hl7.org/fhir/StructureDefinition/diagnosticReport-locationPerformed")
               .setValue(new Reference(param));
      }
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

   public Iqicorediagnosticreport setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorediagnosticreport setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<DiagnosticReport.DiagnosticReportImageComponent> getImage()
   {
      try
      {
         return adaptedClass.getImage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Image", e);
      }
   }

   public qicorediagnosticreportAdapter setImage(
         List<DiagnosticReport.DiagnosticReportImageComponent> param)
   {
      adaptedClass.setImage(param);
      return this;
   }

   public boolean hasImage()
   {
      return adaptedClass.hasImage();
   }

   public qicorediagnosticreportAdapter addImage(
         DiagnosticReport.DiagnosticReportImageComponent param)
   {
      adaptedClass.addImage(param);
      return this;
   }

   public DiagnosticReport.DiagnosticReportImageComponent addImage()
   {
      return adaptedClass.addImage();
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

   public Iqicorediagnosticreport setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicorediagnosticreport setEncounterTarget(Encounter param)
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

   public Iqicorediagnosticreport setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
      return this;
   }

   public List<Attachment> getPresentedForm()
   {
      try
      {
         return adaptedClass.getPresentedForm();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PresentedForm", e);
      }
   }

   public Iqicorediagnosticreport setPresentedForm(List<Attachment> param)
   {
      adaptedClass.setPresentedForm(param);
      return this;
   }

   public boolean hasPresentedForm()
   {
      return adaptedClass.hasPresentedForm();
   }

   public Iqicorediagnosticreport addPresentedForm(Attachment param)
   {
      adaptedClass.addPresentedForm(param);
      return this;
   }

   public Attachment addPresentedForm()
   {
      return adaptedClass.addPresentedForm();
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

   public Iqicorediagnosticreport setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
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

   public Iqicorediagnosticreport setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticreport setSubjectTarget(Patient param)
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

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicorepatientAdapter param)
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

   public Iqicorediagnosticreport setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public Reference getSubjectDevice()
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

   public Device getSubjectDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticreport setSubjectTarget(Device param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicoredeviceAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectLocation()
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

   public Location getSubjectLocationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticreport setSubjectTarget(Location param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorelocationAdapter getSubjectLocationAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorediagnosticreport setSubjectAdapterTarget(
         qicorelocationAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
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

   public Iqicorediagnosticreport setCategory(CodeableConcept param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public boolean hasSpecimen()
   {
      return adaptedClass.hasSpecimen();
   }

   public List<Reference> getSpecimen()
   {
      return adaptedClass.getSpecimen();
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public DiagnosticReport.DiagnosticReportStatus getStatus()
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

   public Enumeration<DiagnosticReport.DiagnosticReportStatus> getStatusElement()
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

   public Iqicorediagnosticreport setStatus(
         DiagnosticReport.DiagnosticReportStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorediagnosticreport setStatusElement(
         Enumeration<DiagnosticReport.DiagnosticReportStatus> param)
   {
      adaptedClass.setStatusElement(param);
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

   public Iqicorediagnosticreport setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorediagnosticreport addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public boolean hasConclusion()
   {
      return adaptedClass.hasConclusion();
   }

   public boolean hasConclusionElement()
   {
      return adaptedClass.hasConclusionElement();
   }

   public StringType getConclusionElement()
   {
      try
      {
         return adaptedClass.getConclusionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ConclusionElement", e);
      }
   }

   public String getConclusion()
   {
      try
      {
         return adaptedClass.getConclusion();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Conclusion", e);
      }
   }

   public Iqicorediagnosticreport setConclusionElement(StringType param)
   {
      adaptedClass.setConclusionElement(param);
      return this;
   }

   public Iqicorediagnosticreport setConclusion(String param)
   {
      adaptedClass.setConclusion(param);
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

   public Iqicorediagnosticreport setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorediagnosticreport setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasImagingStudy()
   {
      return adaptedClass.hasImagingStudy();
   }

   public List<ImagingStudy> getImagingStudyImagingStudyTarget() {
		List<org.hl7.fhir.dstu3.model.ImagingStudy> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getImagingStudyTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ImagingStudy) resource);
		}
		return items;
	}

   public List<Reference> getImagingStudy()
   {
      return adaptedClass.getImagingStudy();
   }

   public List<ImagingManifest> getImagingStudyImagingManifestTarget() {
		List<org.hl7.fhir.dstu3.model.ImagingManifest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getImagingStudyTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ImagingManifest) resource);
		}
		return items;
	}

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public List<Practitioner> getPerformerPractitionerTarget() {
		List<org.hl7.fhir.dstu3.model.Practitioner> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getPerformerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Practitioner) resource);
		}
		return items;
	}

   public List<Reference> getPerformer()
   {
      return adaptedClass.getPerformer();
   }

   public List<Organization> getPerformerOrganizationTarget() {
		List<org.hl7.fhir.dstu3.model.Organization> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getPerformerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Organization) resource);
		}
		return items;
	}

   public boolean hasResult()
   {
      return adaptedClass.hasResult();
   }

   public List<Reference> getResult()
   {
      return adaptedClass.getResult();
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

   public Iqicorediagnosticreport setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorediagnosticreport setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasRequest()
   {
      return adaptedClass.hasRequest();
   }

   public List<DiagnosticRequest> getRequestDiagnosticRequestTarget() {
		List<org.hl7.fhir.dstu3.model.DiagnosticRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRequestTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.DiagnosticRequest) resource);
		}
		return items;
	}

   public List<Reference> getRequest()
   {
      return adaptedClass.getRequest();
   }

   public List<ProcedureRequest> getRequestProcedureRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ProcedureRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRequestTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ProcedureRequest) resource);
		}
		return items;
	}

   public List<ReferralRequest> getRequestReferralRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ReferralRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRequestTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ReferralRequest) resource);
		}
		return items;
	}

   public Type getEffective()
   {
      try
      {
         return adaptedClass.getEffective();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Effective", e);
      }
   }

   public Iqicorediagnosticreport setEffective(Type param)
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
         throw new RuntimeException("Error getting EffectiveDateTimeType", e);
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
         throw new RuntimeException("Error getting EffectivePeriod", e);
      }
   }

   public boolean hasEffectivePeriod()
   {
      return adaptedClass.hasEffectivePeriod();
   }

   public List<CodeableConcept> getCodedDiagnosis()
   {
      try
      {
         return adaptedClass.getCodedDiagnosis();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CodedDiagnosis", e);
      }
   }

   public Iqicorediagnosticreport setCodedDiagnosis(List<CodeableConcept> param)
   {
      adaptedClass.setCodedDiagnosis(param);
      return this;
   }

   public boolean hasCodedDiagnosis()
   {
      return adaptedClass.hasCodedDiagnosis();
   }

   public Iqicorediagnosticreport addCodedDiagnosis(CodeableConcept param)
   {
      adaptedClass.addCodedDiagnosis(param);
      return this;
   }

   public CodeableConcept addCodedDiagnosis()
   {
      return adaptedClass.addCodedDiagnosis();
   }
}