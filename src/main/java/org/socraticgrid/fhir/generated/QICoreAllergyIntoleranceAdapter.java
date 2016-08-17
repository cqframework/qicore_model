package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreAllergyIntolerance;
import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreAllergyIntoleranceAdapter implements IQICoreAllergyIntolerance
{

   private AllergyIntolerance adaptedClass = null;

   public QICoreAllergyIntoleranceAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance();
   }

   public QICoreAllergyIntoleranceAdapter(AllergyIntolerance adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public AllergyIntolerance getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(AllergyIntolerance param)
   {
      this.adaptedClass = param;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreAllergyIntolerance setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreAllergyIntolerance addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public String getType()
   {
      return adaptedClass.getType();
   }

   public IQICoreAllergyIntolerance setType(String param)
   {
      adaptedClass
            .setType(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreAllergyIntolerance setType(AllergyIntoleranceTypeEnum param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement()
   {
      return adaptedClass.getTypeElement();
   }

   public IQICoreAllergyIntolerance setType(
         BoundCodeDt<AllergyIntoleranceTypeEnum> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public CodeableConceptDt getSubstance()
   {
      return adaptedClass.getSubstance();
   }

   public IQICoreAllergyIntolerance setSubstance(CodeableConceptDt param)
   {
      adaptedClass.setSubstance(param);
      return this;
   }

   public List<QICoreAllergyIntoleranceReaction> getWrappedReaction() {
		List<org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction type : adaptedClass
				.getReaction()) {
			items.add(new org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction(
					type));
		}
		return items;
	}

   public IQICoreAllergyIntolerance setWrappedReaction(
			List<QICoreAllergyIntoleranceReaction> param) {
		List<ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setReaction(items);
		return this;
	}

   public IQICoreAllergyIntolerance addWrappedReaction(
         QICoreAllergyIntoleranceReaction param)
   {
      if (param != null)
      {
         adaptedClass.addReaction(param.getAdaptee());
      }
      return this;
   }

   public QICoreAllergyIntoleranceReaction addWrappedReaction()
   {
      ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction item = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction();
      adaptedClass.addReaction(item);
      return new org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction(
            item);
   }

   public QICoreAllergyIntoleranceReaction getWrappedReactionFirstRep()
   {
      org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction wrapperItem = new org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction();
      ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction item = adaptedClass
            .getReactionFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction(
               item);
      }
      return wrapperItem;
   }

   public List<AllergyIntolerance.Reaction> getReaction()
   {
      return adaptedClass.getReaction();
   }

   public IQICoreAllergyIntolerance setReaction(
         List<AllergyIntolerance.Reaction> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public IQICoreAllergyIntolerance addReaction(
         AllergyIntolerance.Reaction param)
   {
      adaptedClass.addReaction(param);
      return this;
   }

   public AllergyIntolerance.Reaction addReaction()
   {
      ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction item = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction();
      adaptedClass.addReaction(item);
      return item;
   }

   public AllergyIntolerance.Reaction getReactionFirstRep()
   {
      return adaptedClass.getReactionFirstRep();
   }

   public String getCriticality()
   {
      return adaptedClass.getCriticality();
   }

   public IQICoreAllergyIntolerance setCriticality(String param)
   {
      adaptedClass
            .setCriticality(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreAllergyIntolerance setCriticality(
         AllergyIntoleranceCriticalityEnum param)
   {
      adaptedClass.setCriticality(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement()
   {
      return adaptedClass.getCriticalityElement();
   }

   public IQICoreAllergyIntolerance setCriticality(
         BoundCodeDt<AllergyIntoleranceCriticalityEnum> param)
   {
      adaptedClass.setCriticality(param);
      return this;
   }

   public String getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IQICoreAllergyIntolerance setCategory(String param)
   {
      adaptedClass
            .setCategory(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreAllergyIntolerance setCategory(
         AllergyIntoleranceCategoryEnum param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement()
   {
      return adaptedClass.getCategoryElement();
   }

   public IQICoreAllergyIntolerance setCategory(
         BoundCodeDt<AllergyIntoleranceCategoryEnum> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public ExtensionDt getResolutionAge()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.api.ExtensionDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for resolutionAge");
      }
   }

   public IQICoreAllergyIntolerance setResolutionAge(ExtensionDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge",
                  param);
      return this;
   }

   public CodeableConceptDt getReasonRefuted()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-reasonRefuted");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRefuted");
      }
   }

   public IQICoreAllergyIntolerance setReasonRefuted(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/allergyintolerance-reasonRefuted",
                  param);
      return this;
   }

   public DateTimeDt getLastOccurenceElement()
   {
      return adaptedClass.getLastOccurenceElement();
   }

   public Date getLastOccurence()
   {
      return adaptedClass.getLastOccurence();
   }

   public IQICoreAllergyIntolerance setLastOccurence(Date param)
   {
      adaptedClass
            .setLastOccurence(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IQICoreAllergyIntolerance setLastOccurence(DateTimeDt param)
   {
      adaptedClass.setLastOccurence(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreAllergyIntolerance setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreAllergyIntolerance setStatus(
         AllergyIntoleranceStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreAllergyIntolerance setStatus(
         BoundCodeDt<AllergyIntoleranceStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public AnnotationDt getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreAllergyIntolerance setNote(AnnotationDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreAllergyIntolerance setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreAllergyIntolerance setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreAllergyIntolerance setPatientResource(
         QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreAllergyIntolerance setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreAllergyIntolerance setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public DateTimeDt getRecordedDateElement()
   {
      return adaptedClass.getRecordedDateElement();
   }

   public Date getRecordedDate()
   {
      return adaptedClass.getRecordedDate();
   }

   public IQICoreAllergyIntolerance setRecordedDate(Date param)
   {
      adaptedClass
            .setRecordedDate(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IQICoreAllergyIntolerance setRecordedDate(DateTimeDt param)
   {
      adaptedClass.setRecordedDate(param);
      return this;
   }

   public DateTimeDt getOnsetElement()
   {
      return adaptedClass.getOnsetElement();
   }

   public Date getOnset()
   {
      return adaptedClass.getOnset();
   }

   public IQICoreAllergyIntolerance setOnset(Date param)
   {
      adaptedClass
            .setOnset(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IQICoreAllergyIntolerance setOnset(DateTimeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }
}