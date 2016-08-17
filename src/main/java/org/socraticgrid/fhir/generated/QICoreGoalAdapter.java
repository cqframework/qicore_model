package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreGoal;
import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.primitive.StringDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import org.socraticgrid.fhir.generated.QICoreGoalTarget;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreGoalAdapter implements IQICoreGoal
{

   private Goal adaptedClass = null;

   public QICoreGoalAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Goal();
   }

   public QICoreGoalAdapter(Goal adaptee)
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

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public IQICoreGoal setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreGoal setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreGoal setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IQICoreGoal addNote(AnnotationDt param)
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

   public List<Goal.Outcome> getOutcome()
   {
      return adaptedClass.getOutcome();
   }

   public IQICoreGoal setOutcome(List<Goal.Outcome> param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public IQICoreGoal addOutcome(Goal.Outcome param)
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

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreGoal setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreGoal addIdentifier(IdentifierDt param)
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

   public List<QICoreGoalTarget> getTarget() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target");
		List<org.socraticgrid.fhir.generated.QICoreGoalTarget> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			org.socraticgrid.fhir.generated.QICoreGoalTarget udt = new org.socraticgrid.fhir.generated.QICoreGoalTarget();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public IQICoreGoal setTarget(List<QICoreGoalTarget> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.generated.QICoreGoalTarget>) param)
               .size(); index++)
         {
            adaptedClass.addUndeclaredExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public CodeableConceptDt getReasonRejected()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-reasonRejected");
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
               "More than one extension exists for reasonRejected");
      }
   }

   public IQICoreGoal setReasonRejected(CodeableConceptDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/goal-reasonRejected",
            param);
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

   public IQICoreGoal setStartDate(DateDt param)
   {
      adaptedClass.setStart(param);
      return this;
   }

   public IQICoreGoal setStartDate(Date param)
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

   public IQICoreGoal setStartCodeableConcept(BoundCodeableConceptDt param)
   {
      adaptedClass.setStart(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreGoal setStatus(String param)
   {
      adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum
            .valueOf(param));
      return this;
   }

   public IQICoreGoal setStatus(GoalStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<GoalStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreGoal setStatus(BoundCodeDt<GoalStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeableConceptDt<GoalPriorityEnum> getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IQICoreGoal setPriority(
         BoundCodeableConceptDt<GoalPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreGoal setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreGoal setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
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

   public IQICoreGoal setTargetDate(DateDt param)
   {
      adaptedClass.setTarget(param);
      return this;
   }

   public IQICoreGoal setTargetDate(Date param)
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

   public IQICoreGoal setTargetQuantity(DurationDt param)
   {
      adaptedClass.setTarget(param);
      return this;
   }

   public CodeableConceptDt getStatusReason()
   {
      return adaptedClass.getStatusReason();
   }

   public IQICoreGoal setStatusReason(CodeableConceptDt param)
   {
      adaptedClass.setStatusReason(param);
      return this;
   }

   public DateDt getStatusDateElement()
   {
      return adaptedClass.getStatusDateElement();
   }

   public Date getStatusDate()
   {
      return adaptedClass.getStatusDate();
   }

   public IQICoreGoal setStatusDate(Date param)
   {
      adaptedClass
            .setStatusDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IQICoreGoal setStatusDate(DateDt param)
   {
      adaptedClass.setStatusDate(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreGoal setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreGoal setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }
}