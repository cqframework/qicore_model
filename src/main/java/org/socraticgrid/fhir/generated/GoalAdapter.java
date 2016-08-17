package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IGoal;
import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class GoalAdapter implements IGoal
{

   private Goal adaptedClass = null;

   public GoalAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Goal();
   }

   public GoalAdapter(Goal adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Goal getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Goal param)
   {
      this.adaptedClass = param;
   }

   public BoundCodeableConceptDt<GoalPriorityEnum> getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IGoal setPriority(BoundCodeableConceptDt<GoalPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IGoal setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public IGoal setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IGoal setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public List<Goal.Outcome> getOutcome()
   {
      return adaptedClass.getOutcome();
   }

   public IGoal setOutcome(List<Goal.Outcome> param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public IGoal addOutcome(Goal.Outcome param)
   {
      adaptedClass.addOutcome(param);
      return this;
   }

   public Goal.Outcome addOutcome()
   {
      ca.uhn.fhir.model.dstu2.resource.Goal.Outcome item = new ca.uhn.fhir.model.dstu2.resource.Goal.Outcome();
      adaptedClass.addOutcome(item);
      return item;
   }

   public Goal.Outcome getOutcomeFirstRep()
   {
      return adaptedClass.getOutcomeFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IGoal setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IGoal setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IGoal addNote(AnnotationDt param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public AnnotationDt addNote()
   {
      ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
      adaptedClass.addNote(item);
      return item;
   }

   public AnnotationDt getNoteFirstRep()
   {
      return adaptedClass.getNoteFirstRep();
   }

   public DateDt getTargetDateElement()
   {
      if (adaptedClass.getTarget() != null
            && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.primitive.DateDt)
      {
         return (ca.uhn.fhir.model.primitive.DateDt) adaptedClass
               .getTarget();
      }
      else
      {
         return null;
      }
   }

   public Date getTargetDate()
   {
      if (adaptedClass.getTarget() != null
            && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.primitive.DateDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateDt) adaptedClass
               .getTarget()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IGoal setTargetDate(DateDt param)
   {
      adaptedClass.setTarget(param);
      return this;
   }

   public IGoal setTargetDate(Date param)
   {
      adaptedClass.setTarget(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public DurationDt getTargetQuantity()
   {
      if (adaptedClass.getTarget() != null
            && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.dstu2.composite.DurationDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.DurationDt) adaptedClass
               .getTarget();
      }
      else
      {
         return null;
      }
   }

   public IGoal setTargetQuantity(DurationDt param)
   {
      adaptedClass.setTarget(param);
      return this;
   }

   public CodeableConceptDt getStatusReason()
   {
      return adaptedClass.getStatusReason();
   }

   public IGoal setStatusReason(CodeableConceptDt param)
   {
      adaptedClass.setStatusReason(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IGoal setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IGoal addIdentifier(IdentifierDt param)
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

   public DateDt getStatusDateElement()
   {
      return adaptedClass.getStatusDateElement();
   }

   public Date getStatusDate()
   {
      return adaptedClass.getStatusDate();
   }

   public IGoal setStatusDate(Date param)
   {
      adaptedClass
            .setStatusDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IGoal setStatusDate(DateDt param)
   {
      adaptedClass.setStatusDate(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IGoal setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public DateDt getStartDateElement()
   {
      if (adaptedClass.getStart() != null
            && adaptedClass.getStart() instanceof ca.uhn.fhir.model.primitive.DateDt)
      {
         return (ca.uhn.fhir.model.primitive.DateDt) adaptedClass.getStart();
      }
      else
      {
         return null;
      }
   }

   public Date getStartDate()
   {
      if (adaptedClass.getStart() != null
            && adaptedClass.getStart() instanceof ca.uhn.fhir.model.primitive.DateDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateDt) adaptedClass
               .getStart()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IGoal setStartDate(DateDt param)
   {
      adaptedClass.setStart(param);
      return this;
   }

   public IGoal setStartDate(Date param)
   {
      adaptedClass.setStart(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public BoundCodeableConceptDt getStartCodeableConcept()
   {
      if (adaptedClass.getStart() != null
            && adaptedClass.getStart() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getStart();
      }
      else
      {
         return null;
      }
   }

   public IGoal setStartCodeableConcept(BoundCodeableConceptDt param)
   {
      adaptedClass.setStart(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IGoal setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IGoal setStatus(String param)
   {
      adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum
            .valueOf(param));
      return this;
   }

   public IGoal setStatus(GoalStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<GoalStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IGoal setStatus(BoundCodeDt<GoalStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }
}