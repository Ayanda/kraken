// Copyright 1998-2014 Epic Games, Inc. All Rights Reserved.
#pragma once

#include "TopFrameworkGameCharacter.generated.h"

UCLASS(Blueprintable)
class ATopFrameworkGameCharacter : public ACharacter
{
	GENERATED_UCLASS_BODY()

	/** Top down camera */
	UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = Camera)
	TSubobjectPtr<UCameraComponent> TopDownCameraComponent;

	/** Camera boom positioning the camera above the character */
	UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = Camera)
	TSubobjectPtr<class USpringArmComponent> CameraBoom;

};

