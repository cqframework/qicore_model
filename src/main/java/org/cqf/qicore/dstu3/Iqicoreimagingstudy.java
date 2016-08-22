package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.ImagingStudy;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.EpisodeOfCare;
import org.hl7.fhir.dstu3.model.StringType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.OidType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Range;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Duration;
import org.hl7.fhir.dstu3.model.Coding;

public interface Iqicoreimagingstudy
{

   public ImagingStudy getAdaptee();

   public void setAdaptee(ImagingStudy param);

   public List<ImagingStudy.StudyBaseLocationComponent> getBaseLocation();

   public qicoreimagingstudyAdapter setBaseLocation(
         List<ImagingStudy.StudyBaseLocationComponent> param);

   public boolean hasBaseLocation();

   public qicoreimagingstudyAdapter addBaseLocation(
         ImagingStudy.StudyBaseLocationComponent param);

   public ImagingStudy.StudyBaseLocationComponent addBaseLocation();

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoreimagingstudy setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoreimagingstudy setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoreimagingstudy setPatientAdapterTarget(
         qicorepatientAdapter param);

   public CodeableConcept getReason();

   public Iqicoreimagingstudy setReason(CodeableConcept param);

   public boolean hasReason();

   public Reference getContext();

   public Resource getContextTarget();

   public boolean hasContext();

   public Reference getContextEncounter();

   public Iqicoreimagingstudy setContext(Reference param);

   public Encounter getContextEncounterTarget();

   public Iqicoreimagingstudy setContextTarget(Encounter param);

   public Reference getContextEpisodeOfCare();

   public EpisodeOfCare getContextEpisodeOfCareTarget();

   public Iqicoreimagingstudy setContextTarget(EpisodeOfCare param);

   public List<ImagingStudy.ImagingStudySeriesComponent> getSeries();

   public qicoreimagingstudyAdapter setSeries(
         List<ImagingStudy.ImagingStudySeriesComponent> param);

   public boolean hasSeries();

   public qicoreimagingstudyAdapter addSeries(
         ImagingStudy.ImagingStudySeriesComponent param);

   public ImagingStudy.ImagingStudySeriesComponent addSeries();

   public boolean hasDescription();

   public boolean hasDescriptionElement();

   public StringType getDescriptionElement();

   public String getDescription();

   public Iqicoreimagingstudy setDescriptionElement(StringType param);

   public Iqicoreimagingstudy setDescription(String param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreimagingstudy setImplicitRulesElement(UriType param);

   public Iqicoreimagingstudy setImplicitRules(String param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreimagingstudy setIdElement(IdType param);

   public Iqicoreimagingstudy setId(String param);

   public boolean hasUid();

   public boolean hasUidElement();

   public OidType getUidElement();

   public String getUid();

   public Iqicoreimagingstudy setUidElement(OidType param);

   public Iqicoreimagingstudy setUid(String param);

   public boolean hasAvailability();

   public boolean hasAvailabilityElement();

   public ImagingStudy.InstanceAvailability getAvailability();

   public Enumeration<ImagingStudy.InstanceAvailability> getAvailabilityElement();

   public Iqicoreimagingstudy setAvailability(
         ImagingStudy.InstanceAvailability param);

   public Iqicoreimagingstudy setAvailabilityElement(
         Enumeration<ImagingStudy.InstanceAvailability> param);

   public Identifier getAccession();

   public Iqicoreimagingstudy setAccession(Identifier param);

   public boolean hasAccession();

   public boolean hasProcedure();

   public List<Reference> getProcedure();

   public Range getRadiationDose();

   public Iqicoreimagingstudy setRadiationDose(Range param);

   public List<Identifier> getIdentifier();

   public Iqicoreimagingstudy setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreimagingstudy addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<Resource> getContained();

   public Iqicoreimagingstudy setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreimagingstudy addContained(Resource param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreimagingstudy setLanguageElement(CodeType param);

   public Iqicoreimagingstudy setLanguage(String param);

   public boolean hasReferrer();

   public Reference getReferrer();

   public Iqicoreimagingstudy setReferrer(Reference param);

   public Practitioner getReferrerTarget();

   public Iqicoreimagingstudy setReferrerTarget(Practitioner param);

   public qicorepractitionerAdapter getReferrerAdapterTarget();

   public Iqicoreimagingstudy setReferrerAdapterTarget(
         qicorepractitionerAdapter param);

   public boolean hasBasedOn();

   public List<Reference> getBasedOn();

   public Duration getRadiationDuration();

   public Iqicoreimagingstudy setRadiationDuration(Duration param);

   public boolean hasInterpreter();

   public Reference getInterpreter();

   public Iqicoreimagingstudy setInterpreter(Reference param);

   public Practitioner getInterpreterTarget();

   public Iqicoreimagingstudy setInterpreterTarget(Practitioner param);

   public qicorepractitionerAdapter getInterpreterAdapterTarget();

   public Iqicoreimagingstudy setInterpreterAdapterTarget(
         qicorepractitionerAdapter param);

   public List<Coding> getModalityList();

   public Iqicoreimagingstudy setModalityList(List<Coding> param);

   public boolean hasModalityList();

   public Iqicoreimagingstudy addModalityList(Coding param);

   public Coding addModalityList();
}