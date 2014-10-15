// Copyright 1998-2014 Epic Games, Inc. All Rights Reserved.

#include "TopFrameworkGame.h"
#include "TopFrameworkGameGameMode.h"
#include "TopFrameworkGamePlayerController.h"

ATopFrameworkGameGameMode::ATopFrameworkGameGameMode(const class FPostConstructInitializeProperties& PCIP) : Super(PCIP)
{
	// use our custom PlayerController class
	PlayerControllerClass = ATopFrameworkGamePlayerController::StaticClass();

	// set default pawn class to our Blueprinted character
	static ConstructorHelpers::FObjectFinder<UClass> PlayerPawnBPClass(TEXT("Class'/Game/Blueprints/MyCharacter.MyCharacter_C'"));
	if (PlayerPawnBPClass.Object != NULL)
	{
		DefaultPawnClass = PlayerPawnBPClass.Object;

	}
}