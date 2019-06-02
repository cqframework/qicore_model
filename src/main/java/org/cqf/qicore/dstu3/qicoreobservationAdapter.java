package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Observation;
import java.util.List;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.DeviceMetric;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.InstantType;
import java.util.Date;
import org.hl7.fhir.dstu3.model.Specimen;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.model.Range;
import org.hl7.fhir.dstu3.model.Ratio;
import org.hl7.fhir.dstu3.model.SampledData;
import org.hl7.fhir.dstu3.model.Attachment;
import org.hl7.fhir.dstu3.model.TimeType;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.*;

public class qicoreobservationAdapter implements Iqicoreobservation
{

   private Observation adaptedClass;

   public qicoreobservationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Observation();
   }

   public qicoreobservationAdapter(Observation adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Observation getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Observation param)
   {
      this.adaptedClass = param;
   }

   public List<Observation.ObservationRelatedComponent> getRelated()
   {
      try
      {
         return adaptedClass.getRelated();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Related", e);
      }
   }

   public qicoreobservationAdapter setRelated(
         List<Observation.ObservationRelatedComponent> param)
   {
      adaptedClass.setRelated(param);
      return this;
   }

   public boolean hasRelated()
   {
      return adaptedClass.hasRelated();
   }

   public qicoreobservationAdapter addRelated(
         Observation.ObservationRelatedComponent param)
   {
      adaptedClass.addRelated(param);
      return this;
   }

   public Observation.ObservationRelatedComponent addRelated()
   {
      return adaptedClass.addRelated();
   }

   public List<Observation.ObservationComponentComponent> getComponent()
   {
      try
      {
         return adaptedClass.getComponent();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Component", e);
      }
   }

   public qicoreobservationAdapter setComponent(
         List<Observation.ObservationComponentComponent> param)
   {
      adaptedClass.setComponent(param);
      return this;
   }

   public boolean hasComponent()
   {
      return adaptedClass.hasComponent();
   }

   public qicoreobservationAdapter addComponent(
         Observation.ObservationComponentComponent param)
   {
      adaptedClass.addComponent(param);
      return this;
   }

   public Observation.ObservationComponentComponent addComponent()
   {
      return adaptedClass.addComponent();
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

   public Iqicoreobservation setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreobservation addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public Iqicoreobservation setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
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

   public Iqicoreobservation setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreobservation setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConcept getMethod()
   {
      try
      {
         return adaptedClass.getMethod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Method", e);
      }
   }

   public Iqicoreobservation setMethod(CodeableConcept param)
   {
      adaptedClass.setMethod(param);
      return this;
   }

   public boolean hasMethod()
   {
      return adaptedClass.hasMethod();
   }

   public Reference getDevice()
   {
      try
      {
         return adaptedClass.getDevice();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Device", e);
      }
   }

   public Resource getDeviceTarget()
   {
      try
      {
         return adaptedClass.getDeviceTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DeviceTarget", e);
      }
   }

   public boolean hasDevice()
   {
      return adaptedClass.hasDevice();
   }

   public Reference getDeviceDevice()
   {
      try
      {
         return adaptedClass.getDevice();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Device", e);
      }
   }

   public Iqicoreobservation setDevice(Reference param)
   {
      adaptedClass.setDevice(param);
      return this;
   }

   public Device getDeviceDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass.getDeviceTarget();
   }

   public Iqicoreobservation setDeviceTarget(Device param)
   {
      adaptedClass.setDeviceTarget(param);
      return this;
   }

   public qicoredeviceAdapter getDeviceDeviceAdapterTarget()
   {
      if (adaptedClass.getDevice().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getDevice().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreobservation setDeviceAdapterTarget(qicoredeviceAdapter param)
   {
      adaptedClass.setDeviceTarget(param.getAdaptee());
      return this;
   }

   public Reference getDeviceDeviceMetric()
   {
      try
      {
         return adaptedClass.getDevice();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Device", e);
      }
   }

   public DeviceMetric getDeviceDeviceMetricTarget()
   {
      return (org.hl7.fhir.dstu3.model.DeviceMetric) adaptedClass
            .getDeviceTarget();
   }

   public Iqicoreobservation setDeviceTarget(DeviceMetric param)
   {
      adaptedClass.setDeviceTarget(param);
      return this;
   }

   public CodeableConcept getBodyPosition()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/observation-bodyPosition");
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
               "More than one extension exists for bodyPosition");
      }
   }

   public Iqicoreobservation setBodyPosition(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/observation-bodyPosition")
            .setValue(param);
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

   public Observation.ObservationStatus getStatus()
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

   public Enumeration<Observation.ObservationStatus> getStatusElement()
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

   public Iqicoreobservation setStatus(Observation.ObservationStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreobservation setStatusElement(
         Enumeration<Observation.ObservationStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
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

   public List<Patient> getPerformerPatientTarget() {
		List<org.hl7.fhir.dstu3.model.Patient> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getPerformerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Patient) resource);
		}
		return items;
	}

   public List<RelatedPerson> getPerformerRelatedPersonTarget() {
		List<org.hl7.fhir.dstu3.model.RelatedPerson> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getPerformerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.RelatedPerson) resource);
		}
		return items;
	}

   public List<Observation.ObservationReferenceRangeComponent> getReferenceRange()
   {
      try
      {
         return adaptedClass.getReferenceRange();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReferenceRange", e);
      }
   }

   public qicoreobservationAdapter setReferenceRange(
         List<Observation.ObservationReferenceRangeComponent> param)
   {
      adaptedClass.setReferenceRange(param);
      return this;
   }

   public boolean hasReferenceRange()
   {
      return adaptedClass.hasReferenceRange();
   }

   public qicoreobservationAdapter addReferenceRange(
         Observation.ObservationReferenceRangeComponent param)
   {
      adaptedClass.addReferenceRange(param);
      return this;
   }

   public Observation.ObservationReferenceRangeComponent addReferenceRange()
   {
      return adaptedClass.addReferenceRange();
   }

   public CodeableConcept getDataAbsentReason()
   {
      try
      {
         return adaptedClass.getDataAbsentReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DataAbsentReason", e);
      }
   }

   public Iqicoreobservation setDataAbsentReason(CodeableConcept param)
   {
      adaptedClass.setDataAbsentReason(param);
      return this;
   }

   public boolean hasDataAbsentReason()
   {
      return adaptedClass.hasDataAbsentReason();
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

   public Iqicoreobservation setIssuedElement(InstantType param)
   {
      adaptedClass.setIssuedElement(param);
      return this;
   }

   public Iqicoreobservation setIssued(Date param)
   {
      adaptedClass.setIssued(param);
      return this;
   }

   public boolean hasSpecimen()
   {
      return adaptedClass.hasSpecimen();
   }

   public Reference getSpecimen()
   {
      try
      {
         return adaptedClass.getSpecimen();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Specimen", e);
      }
   }

   public Iqicoreobservation setSpecimen(Reference param)
   {
      adaptedClass.setSpecimen(param);
      return this;
   }

   public Specimen getSpecimenTarget()
   {
      return (org.hl7.fhir.dstu3.model.Specimen) adaptedClass
            .getSpecimenTarget();
   }

   public Iqicoreobservation setSpecimenTarget(Specimen param)
   {
      adaptedClass.setSpecimenTarget(param);
      return this;
   }

   public qicorespecimenAdapter getSpecimenAdapterTarget()
   {
      if (adaptedClass.getSpecimen().getResource() instanceof org.hl7.fhir.dstu3.model.Specimen)
      {
         qicorespecimenAdapter profiledType = new qicorespecimenAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Specimen) adaptedClass
                     .getSpecimen().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreobservation setSpecimenAdapterTarget(
         qicorespecimenAdapter param)
   {
      adaptedClass.setSpecimenTarget(param.getAdaptee());
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

   public Iqicoreobservation setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoreobservation setSubjectTarget(Patient param)
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

   public Iqicoreobservation setSubjectAdapterTarget(qicorepatientAdapter param)
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

   public Iqicoreobservation setSubjectTarget(Group param)
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

   public Iqicoreobservation setSubjectTarget(Device param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
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

   public Iqicoreobservation setSubjectAdapterTarget(qicoredeviceAdapter param)
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

   public Iqicoreobservation setSubjectTarget(Location param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorelocationAdapter getSubjectLocationAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         qicorelocationAdapter profiledType = new qicorelocationAdapter();
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

   public Iqicoreobservation setSubjectAdapterTarget(
         qicorelocationAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
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

   public Iqicoreobservation setEncounter(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicoreobservation setEncounterTarget(Encounter param)
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

   public Iqicoreobservation setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public Iqicoreobservation setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreobservation addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public CodeableConcept getInterpretation()
   {
      try
      {
         return adaptedClass.getInterpretation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Interpretation", e);
      }
   }

   public Iqicoreobservation setInterpretation(CodeableConcept param)
   {
      adaptedClass.setInterpretation(param);
      return this;
   }

   public boolean hasInterpretation()
   {
      return adaptedClass.hasInterpretation();
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

   public Iqicoreobservation setCategory(List<CodeableConcept> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Iqicoreobservation addCategory(CodeableConcept param)
   {
      adaptedClass.addCategory(param);
      return this;
   }

   public CodeableConcept addCategory()
   {
      return adaptedClass.addCategory();
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

   public Iqicoreobservation setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreobservation setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasComment()
   {
      return adaptedClass.hasComment();
   }

   public boolean hasCommentElement()
   {
      return adaptedClass.hasCommentElement();
   }

   public StringType getCommentElement()
   {
      try
      {
         return adaptedClass.getCommentElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CommentElement", e);
      }
   }

   public String getComment()
   {
      try
      {
         return adaptedClass.getComment();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Comment", e);
      }
   }

   public Iqicoreobservation setCommentElement(StringType param)
   {
      adaptedClass.setCommentElement(param);
      return this;
   }

   public Iqicoreobservation setComment(String param)
   {
      adaptedClass.setComment(param);
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

   public Iqicoreobservation setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreobservation setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConcept getBodySite()
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

   public Iqicoreobservation setBodySite(CodeableConcept param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public boolean hasBodySite()
   {
      return adaptedClass.hasBodySite();
   }

   public Type getValue()
   {
      try
      {
         return adaptedClass.getValue();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Value", e);
      }
   }

   public Iqicoreobservation setValue(Type param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public Quantity getValueQuantity()
   {
      try
      {
         return adaptedClass.getValueQuantity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueQuantity", e);
      }
   }

   public boolean hasValueQuantity()
   {
      return adaptedClass.hasValueQuantity();
   }

   public CodeableConcept getValueCodeableConcept()
   {
      try
      {
         return adaptedClass.getValueCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueCodeableConcept", e);
      }
   }

   public boolean hasValueCodeableConcept()
   {
      return adaptedClass.hasValueCodeableConcept();
   }

   public StringType getValueStringType()
   {
      try
      {
         return adaptedClass.getValueStringType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueStringType", e);
      }
   }

   public boolean hasValueStringType()
   {
      return adaptedClass.hasValueStringType();
   }

   public Range getValueRange()
   {
      try
      {
         return adaptedClass.getValueRange();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueRange", e);
      }
   }

   public boolean hasValueRange()
   {
      return adaptedClass.hasValueRange();
   }

   public Ratio getValueRatio()
   {
      try
      {
         return adaptedClass.getValueRatio();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueRatio", e);
      }
   }

   public boolean hasValueRatio()
   {
      return adaptedClass.hasValueRatio();
   }

   public SampledData getValueSampledData()
   {
      try
      {
         return adaptedClass.getValueSampledData();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueSampledData", e);
      }
   }

   public boolean hasValueSampledData()
   {
      return adaptedClass.hasValueSampledData();
   }

   public Attachment getValueAttachment()
   {
      try
      {
         return adaptedClass.getValueAttachment();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueAttachment", e);
      }
   }

   public boolean hasValueAttachment()
   {
      return adaptedClass.hasValueAttachment();
   }

   public TimeType getValueTimeType()
   {
      try
      {
         return adaptedClass.getValueTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueTimeType", e);
      }
   }

   public boolean hasValueTimeType()
   {
      return adaptedClass.hasValueTimeType();
   }

   public DateTimeType getValueDateTimeType()
   {
      try
      {
         return adaptedClass.getValueDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValueDateTimeType", e);
      }
   }

   public boolean hasValueDateTimeType()
   {
      return adaptedClass.hasValueDateTimeType();
   }

   public Period getValuePeriod()
   {
      try
      {
         return adaptedClass.getValuePeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ValuePeriod", e);
      }
   }

   public boolean hasValuePeriod()
   {
      return adaptedClass.hasValuePeriod();
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

   public Iqicoreobservation setEffective(Type param)
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
}
