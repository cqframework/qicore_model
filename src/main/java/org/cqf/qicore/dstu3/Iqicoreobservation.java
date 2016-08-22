package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Observation;
import org.hl7.fhir.dstu3.model.*;

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

public interface Iqicoreobservation
{

   public Observation getAdaptee();

   public void setAdaptee(Observation param);

   public List<Observation.ObservationRelatedComponent> getRelated();

   public qicoreobservationAdapter setRelated(
         List<Observation.ObservationRelatedComponent> param);

   public boolean hasRelated();

   public qicoreobservationAdapter addRelated(
         Observation.ObservationRelatedComponent param);

   public Observation.ObservationRelatedComponent addRelated();

   public List<Observation.ObservationComponentComponent> getComponent();

   public qicoreobservationAdapter setComponent(
         List<Observation.ObservationComponentComponent> param);

   public boolean hasComponent();

   public qicoreobservationAdapter addComponent(
         Observation.ObservationComponentComponent param);

   public Observation.ObservationComponentComponent addComponent();

   public List<Identifier> getIdentifier();

   public Iqicoreobservation setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreobservation addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public CodeableConcept getCode();

   public Iqicoreobservation setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreobservation setLanguageElement(CodeType param);

   public Iqicoreobservation setLanguage(String param);

   public CodeableConcept getMethod();

   public Iqicoreobservation setMethod(CodeableConcept param);

   public boolean hasMethod();

   public Reference getDevice();

   public Resource getDeviceTarget();

   public boolean hasDevice();

   public Reference getDeviceDevice();

   public Iqicoreobservation setDevice(Reference param);

   public Device getDeviceDeviceTarget();

   public Iqicoreobservation setDeviceTarget(Device param);

   public qicoredeviceAdapter getDeviceDeviceAdapterTarget();

   public Iqicoreobservation setDeviceAdapterTarget(qicoredeviceAdapter param);

   public Reference getDeviceDeviceMetric();

   public DeviceMetric getDeviceDeviceMetricTarget();

   public Iqicoreobservation setDeviceTarget(DeviceMetric param);

   public CodeableConcept getBodyPosition();

   public Iqicoreobservation setBodyPosition(CodeableConcept param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public Observation.ObservationStatus getStatus();

   public Enumeration<Observation.ObservationStatus> getStatusElement();

   public Iqicoreobservation setStatus(Observation.ObservationStatus param);

   public Iqicoreobservation setStatusElement(
         Enumeration<Observation.ObservationStatus> param);

   public boolean hasPerformer();

   public List<Practitioner> getPerformerPractitionerTarget();

   public List<Reference> getPerformer();

   public List<Organization> getPerformerOrganizationTarget();

   public List<Patient> getPerformerPatientTarget();

   public List<RelatedPerson> getPerformerRelatedPersonTarget();

   public List<Observation.ObservationReferenceRangeComponent> getReferenceRange();

   public qicoreobservationAdapter setReferenceRange(
         List<Observation.ObservationReferenceRangeComponent> param);

   public boolean hasReferenceRange();

   public qicoreobservationAdapter addReferenceRange(
         Observation.ObservationReferenceRangeComponent param);

   public Observation.ObservationReferenceRangeComponent addReferenceRange();

   public CodeableConcept getDataAbsentReason();

   public Iqicoreobservation setDataAbsentReason(CodeableConcept param);

   public boolean hasDataAbsentReason();

   public boolean hasIssued();

   public boolean hasIssuedElement();

   public InstantType getIssuedElement();

   public Date getIssued();

   public Iqicoreobservation setIssuedElement(InstantType param);

   public Iqicoreobservation setIssued(Date param);

   public boolean hasSpecimen();

   public Reference getSpecimen();

   public Iqicoreobservation setSpecimen(Reference param);

   public Specimen getSpecimenTarget();

   public Iqicoreobservation setSpecimenTarget(Specimen param);

   public qicorespecimenAdapter getSpecimenAdapterTarget();

   public Iqicoreobservation setSpecimenAdapterTarget(
         qicorespecimenAdapter param);

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicoreobservation setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicoreobservation setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicoreobservation setSubjectAdapterTarget(qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicoreobservation setSubjectTarget(Group param);

   public Reference getSubjectDevice();

   public Device getSubjectDeviceTarget();

   public Iqicoreobservation setSubjectTarget(Device param);

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget();

   public Iqicoreobservation setSubjectAdapterTarget(qicoredeviceAdapter param);

   public Reference getSubjectLocation();

   public Location getSubjectLocationTarget();

   public Iqicoreobservation setSubjectTarget(Location param);

   public qicorelocationAdapter getSubjectLocationAdapterTarget();

   public Iqicoreobservation setSubjectAdapterTarget(
         qicorelocationAdapter param);

   public boolean hasEncounter();

   public Reference getEncounter();

   public Iqicoreobservation setEncounter(Reference param);

   public Encounter getEncounterTarget();

   public Iqicoreobservation setEncounterTarget(Encounter param);

   public qicoreencounterAdapter getEncounterAdapterTarget();

   public Iqicoreobservation setEncounterAdapterTarget(
         qicoreencounterAdapter param);

   public List<Resource> getContained();

   public Iqicoreobservation setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreobservation addContained(Resource param);

   public CodeableConcept getInterpretation();

   public Iqicoreobservation setInterpretation(CodeableConcept param);

   public boolean hasInterpretation();

   public List<CodeableConcept> getCategory();

   public Iqicoreobservation setCategory(List<CodeableConcept> param);

   public boolean hasCategory();

   public Iqicoreobservation addCategory(CodeableConcept param);

   public CodeableConcept addCategory();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreobservation setImplicitRulesElement(UriType param);

   public Iqicoreobservation setImplicitRules(String param);

   public boolean hasComment();

   public boolean hasCommentElement();

   public StringType getCommentElement();

   public String getComment();

   public Iqicoreobservation setCommentElement(StringType param);

   public Iqicoreobservation setComment(String param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreobservation setIdElement(IdType param);

   public Iqicoreobservation setId(String param);

   public CodeableConcept getBodySite();

   public Iqicoreobservation setBodySite(CodeableConcept param);

   public boolean hasBodySite();

   public Type getValue();

   public Iqicoreobservation setValue(Type param);

   public Quantity getValueQuantity();

   public boolean hasValueQuantity();

   public CodeableConcept getValueCodeableConcept();

   public boolean hasValueCodeableConcept();

   public StringType getValueStringType();

   public boolean hasValueStringType();

   public Range getValueRange();

   public boolean hasValueRange();

   public Ratio getValueRatio();

   public boolean hasValueRatio();

   public SampledData getValueSampledData();

   public boolean hasValueSampledData();

   public Attachment getValueAttachment();

   public boolean hasValueAttachment();

   public TimeType getValueTimeType();

   public boolean hasValueTimeType();

   public DateTimeType getValueDateTimeType();

   public boolean hasValueDateTimeType();

   public Period getValuePeriod();

   public boolean hasValuePeriod();

   public Type getEffective();

   public Iqicoreobservation setEffective(Type param);

   public DateTimeType getEffectiveDateTimeType();

   public boolean hasEffectiveDateTimeType();

   public Period getEffectivePeriod();

   public boolean hasEffectivePeriod();
}