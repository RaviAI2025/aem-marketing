# AEM Marketing

Adobe Experience Manager project for Marketing site.

## Modules

- **core**: Java/OSGi bundle with Sling Models, Servlets, and Filters
- **ui.apps**: AEM components, templates, and clientlibs under `/apps/marketing`
- **ui.content**: Content pages under `/content/marketing`
- **ui.config**: OSGi configurations

## Build

```bash
mvn clean install
```

## Deploy to AEM

```bash
mvn clean install -PautoInstallSinglePackage
```
