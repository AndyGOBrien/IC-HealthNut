# Health Nut

##### This is a sample app that displays New York Times Health and Lifestyle Related Books

### Goal
Write a completely modularized sample application that enforces well thought out, well architected, scalable code for a potentially very large single application project

Modularization is great for many reasons, one of the more known reasons is that it can help dramatically with build times. I also think that it can help enforce separation of concerns so that code is kept clean and extensible. I've noticed that as more developers are added to a project the more unwieldy the codebase can become. This approach aims to help alleviate that issue by enforcing separation of concerns through modularization.

As of right now, this is primarily a proof of concept that is a work in progress and is **not** meant to be taken as a concrete example of how I would build an application meant for production.

Everything in this project is 100% up for discussion. I am happy to answer any questions and welcome collaborative feedback.


# Modules

## Data Modules

### Local
Meant for a local cache implementation. This is currently empty, as of right now it is purely meant as an example of where a local cache implementation would live.

###  Remote
The NetworkResponse classes in this module are based on [this blog post](https://proandroiddev.com/create-retrofit-calladapter-for-coroutines-to-handle-response-as-states-c102440de37a). It isn't perfect but with adjustments I think this person's approach is a good start to using coroutines with the popular [Retrofit library](https://square.github.io/retrofit/).

### Models

It is my opinion that feature modules should not have any knowledge of the source of their data so the api model module is strictly kept out of feature dependencies. Instead features are dependent on domain models

Api models are mapped to domain models, which are passed from repositories to ViewModels.

This allows remote APIs to be more freely swapped out for alternatives. The only refactor that would be needed is the api model to domain model mappings.

#### Api Models module

Meant to model data coming back from a remote source, typically a restful api. Feature modules should not be dependant on this

#### Domain Models module

Meant to model data seen / experienced by the end user.

## Feature Modules

This is where you would build features for the android application. In this case the only feature is **Books**. So as of right now there is one **Books Module**.
