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

public class qicoreimagingstudyAdapter implements Iqicoreimagingstudy
{

   private ImagingStudy adaptedClass;

   public qicoreimagingstudyAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.ImagingStudy();
   }

   public qicoreimagingstudyAdapter(ImagingStudy adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ImagingStudy getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ImagingStudy param)
   {
      this.adaptedClass = param;
   }

   public List<ImagingStudy.StudyBaseLocationComponent> getBaseLocation()
   {
      try
      {
         return adaptedClass.getBaseLocation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BaseLocation", e);
      }
   }

   public qicoreimagingstudyAdapter setBaseLocation(
         List<ImagingStudy.StudyBaseLocationComponent> param)
   {
      adaptedClass.setBaseLocation(param);
      return this;
   }

   public boolean hasBaseLocation()
   {
      return adaptedClass.hasBaseLocation();
   }

   public qicoreimagingstudyAdapter addBaseLocation(
         ImagingStudy.StudyBaseLocationComponent param)
   {
      adaptedClass.addBaseLocation(param);
      return this;
   }

   public ImagingStudy.StudyBaseLocationComponent addBaseLocation()
   {
      return adaptedClass.addBaseLocation();
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

   public Iqicoreimagingstudy setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoreimagingstudy setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
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

   public Iqicoreimagingstudy setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public CodeableConcept getReason()
   {
      try
      {
         return adaptedClass.getReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicoreimagingstudy setReason(CodeableConcept param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public boolean hasReason()
   {
      return adaptedClass.hasReason();
   }

   public Reference getContext()
   {
      try
      {
         return adaptedClass.getContext();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Context", e);
      }
   }

   public Resource getContextTarget()
   {
      try
      {
         return adaptedClass.getContextTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ContextTarget", e);
      }
   }

   public boolean hasContext()
   {
      return adaptedClass.hasContext();
   }

   public Reference getContextEncounter()
   {
      try
      {
         return adaptedClass.getContext();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Context", e);
      }
   }

   public Iqicoreimagingstudy setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicoreimagingstudy setContextTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public Reference getContextEpisodeOfCare()
   {
      try
      {
         return adaptedClass.getContext();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Context", e);
      }
   }

   public EpisodeOfCare getContextEpisodeOfCareTarget()
   {
      return (org.hl7.fhir.dstu3.model.EpisodeOfCare) adaptedClass
            .getContextTarget();
   }

   public Iqicoreimagingstudy setContextTarget(EpisodeOfCare param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public List<ImagingStudy.ImagingStudySeriesComponent> getSeries()
   {
      try
      {
         return adaptedClass.getSeries();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Series", e);
      }
   }

   public qicoreimagingstudyAdapter setSeries(
         List<ImagingStudy.ImagingStudySeriesComponent> param)
   {
      adaptedClass.setSeries(param);
      return this;
   }

   public boolean hasSeries()
   {
      return adaptedClass.hasSeries();
   }

   public qicoreimagingstudyAdapter addSeries(
         ImagingStudy.ImagingStudySeriesComponent param)
   {
      adaptedClass.addSeries(param);
      return this;
   }

   public ImagingStudy.ImagingStudySeriesComponent addSeries()
   {
      return adaptedClass.addSeries();
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
   }

   public boolean hasDescriptionElement()
   {
      return adaptedClass.hasDescriptionElement();
   }

   public StringType getDescriptionElement()
   {
      try
      {
         return adaptedClass.getDescriptionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DescriptionElement", e);
      }
   }

   public String getDescription()
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

   public Iqicoreimagingstudy setDescriptionElement(StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public Iqicoreimagingstudy setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
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

   public Iqicoreimagingstudy setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreimagingstudy setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
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

   public Iqicoreimagingstudy setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreimagingstudy setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasUid()
   {
      return adaptedClass.hasUid();
   }

   public boolean hasUidElement()
   {
      return adaptedClass.hasUidElement();
   }

   public OidType getUidElement()
   {
      try
      {
         return adaptedClass.getUidElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting UidElement", e);
      }
   }

   public String getUid()
   {
      try
      {
         return adaptedClass.getUid();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Uid", e);
      }
   }

   public Iqicoreimagingstudy setUidElement(OidType param)
   {
      adaptedClass.setUidElement(param);
      return this;
   }

   public Iqicoreimagingstudy setUid(String param)
   {
      adaptedClass.setUid(param);
      return this;
   }

   public boolean hasAvailability()
   {
      return adaptedClass.hasAvailability();
   }

   public boolean hasAvailabilityElement()
   {
      return adaptedClass.hasAvailabilityElement();
   }

   public ImagingStudy.InstanceAvailability getAvailability()
   {
      try
      {
         return adaptedClass.getAvailability();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Availability", e);
      }
   }

   public Enumeration<ImagingStudy.InstanceAvailability> getAvailabilityElement()
   {
      try
      {
         return adaptedClass.getAvailabilityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AvailabilityElement", e);
      }
   }

   public Iqicoreimagingstudy setAvailability(
         ImagingStudy.InstanceAvailability param)
   {
      adaptedClass.setAvailability(param);
      return this;
   }

   public Iqicoreimagingstudy setAvailabilityElement(
         Enumeration<ImagingStudy.InstanceAvailability> param)
   {
      adaptedClass.setAvailabilityElement(param);
      return this;
   }

   public Identifier getAccession()
   {
      try
      {
         return adaptedClass.getAccession();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Accession", e);
      }
   }

   public Iqicoreimagingstudy setAccession(Identifier param)
   {
      adaptedClass.setAccession(param);
      return this;
   }

   public boolean hasAccession()
   {
      return adaptedClass.hasAccession();
   }

   public boolean hasProcedure()
   {
      return adaptedClass.hasProcedure();
   }

   public List<Reference> getProcedure()
   {
      return adaptedClass.getProcedure();
   }

   public Range getRadiationDose()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/imagingstudy-radiationDose");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Range) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for radiationDose");
      }
   }

   public Iqicoreimagingstudy setRadiationDose(Range param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/imagingstudy-radiationDose")
            .setValue(param);
      return this;
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

   public Iqicoreimagingstudy setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreimagingstudy addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public Iqicoreimagingstudy setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreimagingstudy addContained(Resource param)
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

   public Iqicoreimagingstudy setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreimagingstudy setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasReferrer()
   {
      return adaptedClass.hasReferrer();
   }

   public Reference getReferrer()
   {
      try
      {
         return adaptedClass.getReferrer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Referrer", e);
      }
   }

   public Iqicoreimagingstudy setReferrer(Reference param)
   {
      adaptedClass.setReferrer(param);
      return this;
   }

   public Practitioner getReferrerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getReferrerTarget();
   }

   public Iqicoreimagingstudy setReferrerTarget(Practitioner param)
   {
      adaptedClass.setReferrerTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getReferrerAdapterTarget()
   {
      if (adaptedClass.getReferrer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getReferrer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimagingstudy setReferrerAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setReferrerTarget(param.getAdaptee());
      return this;
   }

   public boolean hasBasedOn()
   {
      return adaptedClass.hasBasedOn();
   }

   public List<Reference> getBasedOn()
   {
      return adaptedClass.getBasedOn();
   }

   public Duration getRadiationDuration()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/imagingstudy-radiationDuration");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Duration) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for radiationDuration");
      }
   }

   public Iqicoreimagingstudy setRadiationDuration(Duration param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/imagingstudy-radiationDuration")
            .setValue(param);
      return this;
   }

   public boolean hasInterpreter()
   {
      return adaptedClass.hasInterpreter();
   }

   public Reference getInterpreter()
   {
      try
      {
         return adaptedClass.getInterpreter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Interpreter", e);
      }
   }

   public Iqicoreimagingstudy setInterpreter(Reference param)
   {
      adaptedClass.setInterpreter(param);
      return this;
   }

   public Practitioner getInterpreterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getInterpreterTarget();
   }

   public Iqicoreimagingstudy setInterpreterTarget(Practitioner param)
   {
      adaptedClass.setInterpreterTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getInterpreterAdapterTarget()
   {
      if (adaptedClass.getInterpreter().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getInterpreter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimagingstudy setInterpreterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setInterpreterTarget(param.getAdaptee());
      return this;
   }

   public List<Coding> getModalityList()
   {
      try
      {
         return adaptedClass.getModalityList();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ModalityList", e);
      }
   }

   public Iqicoreimagingstudy setModalityList(List<Coding> param)
   {
      adaptedClass.setModalityList(param);
      return this;
   }

   public boolean hasModalityList()
   {
      return adaptedClass.hasModalityList();
   }

   public Iqicoreimagingstudy addModalityList(Coding param)
   {
      adaptedClass.addModalityList(param);
      return this;
   }

   public Coding addModalityList()
   {
      return adaptedClass.addModalityList();
   }
}