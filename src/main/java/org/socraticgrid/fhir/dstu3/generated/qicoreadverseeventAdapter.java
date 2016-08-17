package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoreadverseevent;
import org.hl7.fhir.dstu3.model.Basic;
import java.util.List;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.DateType;
import java.util.Date;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.IdType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreadverseeventAdapter implements Iqicoreadverseevent
{

   private Basic adaptedClass;

   public qicoreadverseeventAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Basic();
   }

   public qicoreadverseeventAdapter(Basic adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Basic getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Basic param)
   {
      this.adaptedClass = param;
   }

   public List<qicoreadverseeventCauseAdapter> getCause() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause");
		List<org.socraticgrid.fhir.dstu3.generated.qicoreadverseeventCauseAdapter> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.socraticgrid.fhir.dstu3.generated.qicoreadverseeventCauseAdapter udt = new org.socraticgrid.fhir.dstu3.generated.qicoreadverseeventCauseAdapter();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public Iqicoreadverseevent setCause(
         List<qicoreadverseeventCauseAdapter> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.dstu3.generated.qicoreadverseeventCauseAdapter>) param)
               .size(); index++)
         {
            adaptedClass.addExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public Reference getAuthor()
   {
      try
      {
         return adaptedClass.getAuthor();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Author", e);
      }
   }

   public Resource getAuthorTarget()
   {
      try
      {
         return adaptedClass.getAuthorTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AuthorTarget", e);
      }
   }

   public boolean hasAuthor()
   {
      return adaptedClass.hasAuthor();
   }

   public Reference getAuthorPatient()
   {
      try
      {
         return adaptedClass.getAuthor();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Author", e);
      }
   }

   public Iqicoreadverseevent setAuthor(Reference param)
   {
      adaptedClass.setAuthor(param);
      return this;
   }

   public Patient getAuthorPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getAuthorTarget();
   }

   public Iqicoreadverseevent setAuthorTarget(Patient param)
   {
      adaptedClass.setAuthorTarget(param);
      return this;
   }

   public qicorepatientAdapter getAuthorPatientAdapterTarget()
   {
      if (adaptedClass.getAuthor().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getAuthor().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreadverseevent setAuthorAdapterTarget(qicorepatientAdapter param)
   {
      adaptedClass.setAuthorTarget(param.getAdaptee());
      return this;
   }

   public Reference getAuthorRelatedPerson()
   {
      try
      {
         return adaptedClass.getAuthor();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Author", e);
      }
   }

   public RelatedPerson getAuthorRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getAuthorTarget();
   }

   public Iqicoreadverseevent setAuthorTarget(RelatedPerson param)
   {
      adaptedClass.setAuthorTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getAuthorRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getAuthor().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getAuthor().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreadverseevent setAuthorAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setAuthorTarget(param.getAdaptee());
      return this;
   }

   public Reference getAuthorPractitioner()
   {
      try
      {
         return adaptedClass.getAuthor();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Author", e);
      }
   }

   public Practitioner getAuthorPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getAuthorTarget();
   }

   public Iqicoreadverseevent setAuthorTarget(Practitioner param)
   {
      adaptedClass.setAuthorTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getAuthorPractitionerAdapterTarget()
   {
      if (adaptedClass.getAuthor().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getAuthor().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreadverseevent setAuthorAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setAuthorTarget(param.getAdaptee());
      return this;
   }

   public List<BooleanType> getModifierExtension() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-didNotOccur");
		List<org.hl7.fhir.dstu3.model.BooleanType> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.BooleanType) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setModifierExtension(List<BooleanType> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-didNotOccur")
                  .setValue(param.get(index));
         }
      }
      return this;
   }

   public List<Condition> getReaction() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-reaction");
		List<org.hl7.fhir.dstu3.model.Condition> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.hl7.fhir.dstu3.model.Reference reference = (org.hl7.fhir.dstu3.model.Reference) extension
					.getValue();
			returnList.add((org.hl7.fhir.dstu3.model.Condition) reference
					.getResource());
		}
		return returnList;
	}

   public Iqicoreadverseevent setReaction(List<Condition> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference(
                  param.get(index));
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-reaction")
                  .setValue(reference);
         }
      }
      return this;
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

   public Iqicoreadverseevent setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public List<Location> getLocation() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-location");
		List<org.hl7.fhir.dstu3.model.Location> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.hl7.fhir.dstu3.model.Reference reference = (org.hl7.fhir.dstu3.model.Reference) extension
					.getValue();
			returnList.add((org.hl7.fhir.dstu3.model.Location) reference
					.getResource());
		}
		return returnList;
	}

   public Iqicoreadverseevent setLocation(List<Location> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference(
                  param.get(index));
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-location")
                  .setValue(reference);
         }
      }
      return this;
   }

   public boolean hasCreated()
   {
      return adaptedClass.hasCreated();
   }

   public boolean hasCreatedElement()
   {
      return adaptedClass.hasCreatedElement();
   }

   public DateType getCreatedElement()
   {
      try
      {
         return adaptedClass.getCreatedElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CreatedElement", e);
      }
   }

   public Date getCreated()
   {
      try
      {
         return adaptedClass.getCreated();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Created", e);
      }
   }

   public Iqicoreadverseevent setCreatedElement(DateType param)
   {
      adaptedClass.setCreatedElement(param);
      return this;
   }

   public Iqicoreadverseevent setCreated(Date param)
   {
      adaptedClass.setCreated(param);
      return this;
   }

   public List<CodeableConcept> getType() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-type");
		List<org.hl7.fhir.dstu3.model.CodeableConcept> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.CodeableConcept) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setType(List<CodeableConcept> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-type")
                  .setValue(param.get(index));
         }
      }
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

   public Iqicoreadverseevent setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreadverseevent addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public List<Period> getPeriod() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-period");
		List<org.hl7.fhir.dstu3.model.Period> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.Period) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setPeriod(List<Period> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-period")
                  .setValue(param.get(index));
         }
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

   public Iqicoreadverseevent setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreadverseevent setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<CodeType> getSeverity() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-severity");
		List<org.hl7.fhir.dstu3.model.CodeType> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.CodeType) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setSeverity(List<CodeType> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-severity")
                  .setValue(param.get(index));
         }
      }
      return this;
   }

   public List<StringType> getClinicalStudy() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-clinicalStudy");
		List<org.hl7.fhir.dstu3.model.StringType> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.StringType) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setClinicalStudy(List<StringType> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-clinicalStudy")
                  .setValue(param.get(index));
         }
      }
      return this;
   }

   public List<CodeType> getCategory() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-category");
		List<org.hl7.fhir.dstu3.model.CodeType> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.CodeType) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicoreadverseevent setCategory(List<CodeType> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-category")
                  .setValue(param.get(index));
         }
      }
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

   public Iqicoreadverseevent setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreadverseevent setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
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

   public Iqicoreadverseevent setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreadverseevent setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
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

   public Iqicoreadverseevent setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoreadverseevent setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectAdapterTarget()
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

   public Iqicoreadverseevent setSubjectAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
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

   public Iqicoreadverseevent setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreadverseevent addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }
}