package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreProcedureRequest;
import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreProcedureRequestAdapter implements IQICoreProcedureRequest
{

   private ProcedureRequest adaptedClass = null;

   public QICoreProcedureRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.ProcedureRequest();
   }

   public QICoreProcedureRequestAdapter(ProcedureRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ProcedureRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ProcedureRequest param)
   {
      this.adaptedClass = param;
   }

   public List<AnnotationDt> getNotes()
   {
      return adaptedClass.getNotes();
   }

   public IQICoreProcedureRequest setNotes(List<AnnotationDt> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public IQICoreProcedureRequest addNotes(AnnotationDt param)
   {
      adaptedClass.addNotes(param);
      return this;
   }

   public AnnotationDt addNotes()
   {
      ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
      adaptedClass.addNotes(item);
      return item;
   }

   public AnnotationDt getNotesFirstRep()
   {
      return adaptedClass.getNotesFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreProcedureRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConceptDt getReasonRefused()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused");
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
               "More than one extension exists for reasonRefused");
      }
   }

   public IQICoreProcedureRequest setReasonRefused(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused",
                  param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreProcedureRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public String getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IQICoreProcedureRequest setPriority(String param)
   {
      adaptedClass
            .setPriority(ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreProcedureRequest setPriority(
         ProcedureRequestPriorityEnum param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public BoundCodeDt<ProcedureRequestPriorityEnum> getPriorityElement()
   {
      return adaptedClass.getPriorityElement();
   }

   public IQICoreProcedureRequest setPriority(
         BoundCodeDt<ProcedureRequestPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public DecimalDt getAppropriatenessScore()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-procedurerequest-appropriatenessScore");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.DecimalDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for appropriatenessScore");
      }
   }

   public IQICoreProcedureRequest setAppropriatenessScore(DecimalDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/qicore-procedurerequest-appropriatenessScore",
                  param);
      return this;
   }

   public BoundCodeableConceptDt getReasonCodeableConcept()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setReasonCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public ResourceReferenceDt getReasonReference()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreProcedureRequest setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreProcedureRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreProcedureRequest setStatus(ProcedureRequestStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ProcedureRequestStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreProcedureRequest setStatus(
         BoundCodeDt<ProcedureRequestStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public DateTimeDt getScheduledDateTimeElement()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getScheduled();
      }
      else
      {
         return null;
      }
   }

   public Date getScheduledDateTime()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getScheduled()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setScheduledDateTime(DateTimeDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public IQICoreProcedureRequest setScheduledDateTime(Date param)
   {
      adaptedClass.setScheduled(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getScheduledPeriod()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getScheduled();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setScheduledPeriod(PeriodDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public TimingDt getScheduledTiming()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.dstu2.composite.TimingDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.TimingDt) adaptedClass
               .getScheduled();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setScheduledTiming(TimingDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreProcedureRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreProcedureRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreProcedureRequest addIdentifier(IdentifierDt param)
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

   public BooleanDt getAsNeededBooleanElement()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAsNeeded();
      }
      else
      {
         return null;
      }
   }

   public Boolean getAsNeededBoolean()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAsNeeded()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setAsNeededBoolean(BooleanDt param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public IQICoreProcedureRequest setAsNeededBoolean(Boolean param)
   {
      adaptedClass.setAsNeeded(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public BoundCodeableConceptDt getAsNeededCodeableConcept()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getAsNeeded();
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedureRequest setAsNeededCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public List<ResourceReferenceDt> getApproachBodySite() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite");
		List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreProcedureRequest setApproachBodySite(
         List<ResourceReferenceDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite",
                        (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) param
                              .get(index));
         }
      }
      return this;
   }

   public DateTimeDt getOrderedOnElement()
   {
      return adaptedClass.getOrderedOnElement();
   }

   public Date getOrderedOn()
   {
      return adaptedClass.getOrderedOn();
   }

   public IQICoreProcedureRequest setOrderedOn(Date param)
   {
      adaptedClass.setOrderedOn(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreProcedureRequest setOrderedOn(DateTimeDt param)
   {
      adaptedClass.setOrderedOn(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreProcedureRequest setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }
}