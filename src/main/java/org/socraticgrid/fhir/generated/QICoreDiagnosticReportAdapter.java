package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreDiagnosticReport;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreDiagnosticReportAdapter implements IQICoreDiagnosticReport
{

   private DiagnosticReport adaptedClass = null;

   public QICoreDiagnosticReportAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.DiagnosticReport();
   }

   public QICoreDiagnosticReportAdapter(DiagnosticReport adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticReport getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticReport param)
   {
      this.adaptedClass = param;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreDiagnosticReport setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreDiagnosticReport addIdentifier(IdentifierDt param)
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

   public InstantDt getIssuedElement()
   {
      return adaptedClass.getIssuedElement();
   }

   public Date getIssued()
   {
      return adaptedClass.getIssued();
   }

   public IQICoreDiagnosticReport setIssued(Date param)
   {
      adaptedClass
            .setIssued(new ca.uhn.fhir.model.primitive.InstantDt(param));
      return this;
   }

   public IQICoreDiagnosticReport setIssued(InstantDt param)
   {
      adaptedClass.setIssued(param);
      return this;
   }

   public ResourceReferenceDt getLocationPerformed()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/diagnosticReport-locationPerformed");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for locationPerformed");
      }
   }

   public IQICoreDiagnosticReport setLocationPerformed(
         ResourceReferenceDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/diagnosticReport-locationPerformed",
                  param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreDiagnosticReport setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<DiagnosticReport.Image> getImage()
   {
      return adaptedClass.getImage();
   }

   public IQICoreDiagnosticReport setImage(List<DiagnosticReport.Image> param)
   {
      adaptedClass.setImage(param);
      return this;
   }

   public IQICoreDiagnosticReport addImage(DiagnosticReport.Image param)
   {
      adaptedClass.addImage(param);
      return this;
   }

   public DiagnosticReport.Image addImage()
   {
      ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.Image item = new ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.Image();
      adaptedClass.addImage(item);
      return item;
   }

   public DiagnosticReport.Image getImageFirstRep()
   {
      return adaptedClass.getImageFirstRep();
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

   public IQICoreDiagnosticReport setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public List<AttachmentDt> getPresentedForm()
   {
      return adaptedClass.getPresentedForm();
   }

   public IQICoreDiagnosticReport setPresentedForm(List<AttachmentDt> param)
   {
      adaptedClass.setPresentedForm(param);
      return this;
   }

   public IQICoreDiagnosticReport addPresentedForm(AttachmentDt param)
   {
      adaptedClass.addPresentedForm(param);
      return this;
   }

   public AttachmentDt addPresentedForm()
   {
      ca.uhn.fhir.model.dstu2.composite.AttachmentDt item = new ca.uhn.fhir.model.dstu2.composite.AttachmentDt();
      adaptedClass.addPresentedForm(item);
      return item;
   }

   public AttachmentDt getPresentedFormFirstRep()
   {
      return adaptedClass.getPresentedFormFirstRep();
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreDiagnosticReport setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IQICoreDiagnosticReport setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreDiagnosticReport setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreDiagnosticReport setStatus(DiagnosticReportStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<DiagnosticReportStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreDiagnosticReport setStatus(
         BoundCodeDt<DiagnosticReportStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreDiagnosticReport setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreDiagnosticReport setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public StringDt getConclusionElement()
   {
      return adaptedClass.getConclusionElement();
   }

   public String getConclusion()
   {
      return adaptedClass.getConclusion();
   }

   public IQICoreDiagnosticReport setConclusion(String param)
   {
      adaptedClass.setConclusion(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreDiagnosticReport setConclusion(StringDt param)
   {
      adaptedClass.setConclusion(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreDiagnosticReport setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public DateTimeDt getEffectiveDateTimeElement()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public Date getEffectiveDateTime()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreDiagnosticReport setEffectiveDateTime(DateTimeDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public IQICoreDiagnosticReport setEffectiveDateTime(Date param)
   {
      adaptedClass.setEffective(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getEffectivePeriod()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public IQICoreDiagnosticReport setEffectivePeriod(PeriodDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }
}