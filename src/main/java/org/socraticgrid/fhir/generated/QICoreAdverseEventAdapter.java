package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreAdverseEvent;
import ca.uhn.fhir.model.dstu2.resource.Basic;
import java.util.List;
import org.socraticgrid.fhir.generated.QICoreAdverseEventCause;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreAdverseEventAdapter implements IQICoreAdverseEvent
{

   private Basic adaptedClass = null;

   public QICoreAdverseEventAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Basic();
   }

   public QICoreAdverseEventAdapter(Basic adaptee)
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

   public List<QICoreAdverseEventCause> getCause() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-cause");
		List<org.socraticgrid.fhir.generated.QICoreAdverseEventCause> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			org.socraticgrid.fhir.generated.QICoreAdverseEventCause udt = new org.socraticgrid.fhir.generated.QICoreAdverseEventCause();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public IQICoreAdverseEvent setCause(List<QICoreAdverseEventCause> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.generated.QICoreAdverseEventCause>) param)
               .size(); index++)
         {
            adaptedClass.addUndeclaredExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreAdverseEvent setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<BooleanDt> getDidNotOccur() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-didNotOccur");
		List<ca.uhn.fhir.model.primitive.BooleanDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList.add((ca.uhn.fhir.model.primitive.BooleanDt) extension
					.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setDidNotOccur(List<BooleanDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.primitive.BooleanDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-didNotOccur",
                        (ca.uhn.fhir.model.primitive.BooleanDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<ResourceReferenceDt> getReaction() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-reaction");
		List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setReaction(List<ResourceReferenceDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-reaction",
                        (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) param
                              .get(index));
         }
      }
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreAdverseEvent setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public List<ResourceReferenceDt> getLocation() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-location");
		List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setLocation(List<ResourceReferenceDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-location",
                        (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) param
                              .get(index));
         }
      }
      return this;
   }

   public DateDt getCreatedElement()
   {
      return adaptedClass.getCreatedElement();
   }

   public Date getCreated()
   {
      return adaptedClass.getCreated();
   }

   public IQICoreAdverseEvent setCreated(Date param)
   {
      adaptedClass.setCreated(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IQICoreAdverseEvent setCreated(DateDt param)
   {
      adaptedClass.setCreated(param);
      return this;
   }

   public List<CodeableConceptDt> getType() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-type");
		List<ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setType(List<CodeableConceptDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-type",
                        (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreAdverseEvent setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreAdverseEvent addIdentifier(IdentifierDt param)
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

   public List<PeriodDt> getPeriod() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-period");
		List<ca.uhn.fhir.model.dstu2.composite.PeriodDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.PeriodDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setPeriod(List<PeriodDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.PeriodDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-period",
                        (ca.uhn.fhir.model.dstu2.composite.PeriodDt) param
                              .get(index));
         }
      }
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreAdverseEvent setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<CodeDt> getSeverity() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-severity");
		List<ca.uhn.fhir.model.primitive.CodeDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList.add((ca.uhn.fhir.model.primitive.CodeDt) extension
					.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setSeverity(List<CodeDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.primitive.CodeDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-severity",
                        (ca.uhn.fhir.model.primitive.CodeDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<StringDt> getClinicalStudy() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-clinicalStudy");
		List<ca.uhn.fhir.model.primitive.StringDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList.add((ca.uhn.fhir.model.primitive.StringDt) extension
					.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setClinicalStudy(List<StringDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.primitive.StringDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-clinicalStudy",
                        (ca.uhn.fhir.model.primitive.StringDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<CodeDt> getCategory() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-category");
		List<ca.uhn.fhir.model.primitive.CodeDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList.add((ca.uhn.fhir.model.primitive.CodeDt) extension
					.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setCategory(List<CodeDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.primitive.CodeDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-category",
                        (ca.uhn.fhir.model.primitive.CodeDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<DateTimeDt> getDiscoveryDateTime() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-discoveryDateTime");
		List<ca.uhn.fhir.model.primitive.DateTimeDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList.add((ca.uhn.fhir.model.primitive.DateTimeDt) extension
					.getValue());
		}
		return returnList;
	}

   public IQICoreAdverseEvent setDiscoveryDateTime(List<DateTimeDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.primitive.DateTimeDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/qicore-adverseevent-discoveryDateTime",
                        (ca.uhn.fhir.model.primitive.DateTimeDt) param
                              .get(index));
         }
      }
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreAdverseEvent setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICorePatientAdapter getSubjectResource()
   {
      if (adaptedClass.getSubject().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreAdverseEvent setSubjectResource(QICorePatientAdapter param)
   {
      adaptedClass.getSubject().setResource(param.getAdaptee());
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreAdverseEvent setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }
}