package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IProcedureRequest;
import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ProcedureRequestAdapter implements IProcedureRequest
{

   private ProcedureRequest adaptedClass = null;

   public ProcedureRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.ProcedureRequest();
   }

   public ProcedureRequestAdapter(ProcedureRequest adaptee)
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

   public IProcedureRequest setNotes(List<AnnotationDt> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public IProcedureRequest addNotes(AnnotationDt param)
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

   public IProcedureRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IProcedureRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public String getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IProcedureRequest setPriority(String param)
   {
      adaptedClass
            .setPriority(ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum
                  .valueOf(param));
      return this;
   }

   public IProcedureRequest setPriority(ProcedureRequestPriorityEnum param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public BoundCodeDt<ProcedureRequestPriorityEnum> getPriorityElement()
   {
      return adaptedClass.getPriorityElement();
   }

   public IProcedureRequest setPriority(
         BoundCodeDt<ProcedureRequestPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
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

   public IProcedureRequest setReasonCodeableConcept(
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

   public IProcedureRequest setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IProcedureRequest setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IProcedureRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum
                  .valueOf(param));
      return this;
   }

   public IProcedureRequest setStatus(ProcedureRequestStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ProcedureRequestStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IProcedureRequest setStatus(
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

   public IProcedureRequest setScheduledDateTime(DateTimeDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public IProcedureRequest setScheduledDateTime(Date param)
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

   public IProcedureRequest setScheduledPeriod(PeriodDt param)
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

   public IProcedureRequest setScheduledTiming(TimingDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IProcedureRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IProcedureRequest setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IProcedureRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IProcedureRequest addIdentifier(IdentifierDt param)
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

   public IProcedureRequest setAsNeededBoolean(BooleanDt param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public IProcedureRequest setAsNeededBoolean(Boolean param)
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

   public IProcedureRequest setAsNeededCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setAsNeeded(param);
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

   public IProcedureRequest setOrderedOn(Date param)
   {
      adaptedClass.setOrderedOn(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IProcedureRequest setOrderedOn(DateTimeDt param)
   {
      adaptedClass.setOrderedOn(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IProcedureRequest setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }
}